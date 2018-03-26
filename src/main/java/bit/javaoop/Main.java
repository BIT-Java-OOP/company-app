package bit.javaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company=new Company("BestCompany");
                company.ceo=new CEO("Zbyszek");
                company.ceo.listofManagers=new ArrayList<>();
                    company.ceo.HireManager(new FixedBudgetManager("Maciek", 25_000, 10_000));
                    company.ceo.listofManagers.get(0).listofEmployees=new ArrayList<>();
                        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Wacek", 5_000));
                        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Leszek", 4_000));
                        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Michał", 5_000));
                    company.ceo.HireManager(new FixedEmployeeNumberManager("Krzysiek", 15_000, 3));
                    company.ceo.listofManagers.get(1).listofEmployees=new ArrayList<>();
                        company.ceo.listofManagers.get(1).HireEmployee(new Employee("Frodo", 5_000));

                        System.out.print(company.toString());

    }

}

package bit.javaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractEmployee> EmployeeList = new ArrayList<>();

        Company company = new Company("KarPOL", new CEO("Arkadiusz"));

        FixedBudgetManager FBManager = new FixedBudgetManager("Szymon", 20_000, 30_000, EmployeeList);
        FBManager.hire(new Employee("Aleksandra", 10_000));
        FBManager.hire(new Employee("Adrian", 8_000));
        FBManager.hire(new Employee("Paweł", 12_000));
        FBManager.hire(new Employee("Joachim", 5_000));

        FixedEmployeeNumberManager FEManager = new FixedEmployeeNumberManager("Tomasz", 25_000, 8, EmployeeList);
        FEManager.hire(new Employee("Paulina", 12_000));
        FEManager.hire(new Employee("Patryk", 15_000));
        FEManager.hire(new Employee("Sylwester", 17_000));
        FEManager.hire(new Employee("Katarzyna", 10_000));

        company.hire(FEManager);
        company.hire(FBManager);
        System.out.print(company.toString());


    }
}
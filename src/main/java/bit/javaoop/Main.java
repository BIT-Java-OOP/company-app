package bit.javaoop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractEmployee> EmployeeList = new ArrayList<>();

        Company company = new Company(new CEO("Zbyszek"), "Company");

        FixedBudgetManager FBManager1 = new FixedBudgetManager("Maciek", 25_000, EmployeeList, 50_000);
        FBManager1.hire(new Employee("Wacek", 15_000));
        FBManager1.hire(new Employee("Leszek", 10_000));

        FixedEmployeeNumberManager FENManager1 = new FixedEmployeeNumberManager("Krzysiek", 25_000, EmployeeList, 3);
        FENManager1.hire(new Employee("Frodo", 15_000));


        company.hire(FBManager1);
        company.hire(FENManager1);
        System.out.print(company.toString());
    }

}

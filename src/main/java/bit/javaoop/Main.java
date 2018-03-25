package bit.javaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractEmployee> EmployeeList = new ArrayList<>();

        Company company = new Company(new CEO("Zbyszek"), "Company");

        FixedBudgetManager Manager = new FixedBudgetManager("Maciek", 25_000, EmployeeList, 50_000);
        Manager.hire(new Employee("Wacek", 15_000));
        Manager.hire(new Employee("Leszek", 15_000));
        Manager.hire(new Employee("Grzesiek", 15_000));
        Manager.hire(new Employee("Janusz", 10_000));

        FixedEmployeeNumberManager Manager1 = new FixedEmployeeNumberManager("Krzysiek", 25_000, EmployeeList, 3);
        Manager1.hire(new Employee("Frodo", 15_000));
        Manager1.hire(new Employee("Wiesiek", 15_000));
        Manager1.hire(new Employee("Michał", 15_000));
        Manager1.hire(new Employee("Stanisław", 10_000));

        company.hire(Manager);
        company.hire(Manager1);
        System.out.print(company.toString());

    }

}

package bit.javaoop;

import bit.javaoop.employeesPackage.Employee;
import bit.javaoop.headquartersPackage.Company;
import bit.javaoop.managersPackage.BudgetManager;
import bit.javaoop.managersPackage.EmployeeNumberManager;

public class Main {
    public static void main(String[] args) {
        Company CodeMasters = new Company("CodeMasters", "Zbyszek");

        BudgetManager Maciek = new BudgetManager("Maciek", 50000, 400000, 20);
        EmployeeNumberManager Krzysiek = new EmployeeNumberManager("Krzysiek", 40000, 400000, 20);
        Employee employee = new Employee("Wacek", 20000);
        if (Maciek.canHireEmployee()) {
            Maciek.hireEmployee(employee);
        }
        if (Krzysiek.canHireEmployee()) {
            Krzysiek.hireEmployee(employee);
        }
        if (Maciek.canHireEmployee()) {
            Maciek.hireEmployee(employee);
        }
        if (Krzysiek.canHireEmployee()) {
            Krzysiek.hireEmployee(employee);
        }
        System.out.println(CodeMasters.toString());
    }
}
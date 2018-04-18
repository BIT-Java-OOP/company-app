package bit.javaoop.headquarters;

import bit.javaoop.employees.Employee;
import bit.javaoop.managers.BudgetManager;
import bit.javaoop.managers.EmployeeManager;
import org.junit.jupiter.api.Test;

class CompanyTest {
    @Test
    void ShouldDoToString() {
        //given
        Company company = new Company("Codemasters", "Roger");
        BudgetManager budgetManager = new BudgetManager("Nikodem", 30000, 500000);
        company.getCeo().hireManagers(budgetManager);
        EmployeeManager employeeManager = new EmployeeManager("Kacper", 28000, 30);
        company.getCeo().hireManagers(employeeManager);
        Employee employee1 = new Employee("Wacek", 20000);
        if (budgetManager.canHireEmployee()) {
            budgetManager.hireEmployee(employee1);
        }
        Employee employee2 = new Employee("Leszek", 18000);
        if (employeeManager.canHireEmployee()) {
            employeeManager.hireEmployee(employee2);
        }
        Employee employee3 = new Employee("Grzesiek", 16000);
        if (budgetManager.canHireEmployee()) {
            budgetManager.hireEmployee(employee3);
        }
        Employee employee4 = new Employee("Frodo", 14000);
        if (employeeManager.canHireEmployee()) {
            employeeManager.hireEmployee(employee4);
        }
        //when
        System.out.println(company.toString());
    }

}
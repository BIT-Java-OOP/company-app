package bit.javaoop;

import bit.javaoop.calculator.AnnualSalary;
import bit.javaoop.calculator.BonusToSalary;
import bit.javaoop.company.*;
import bit.javaoop.policy.EmploymentContract;
import bit.javaoop.policy.PolicyB2B;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("Marek Majecki", 25_000, new BonusToSalary(), new EmploymentContract());

        System.out.println(employee.getName() + " " + employee.getSalary());

        Company company = new Company("Smith&Smith");
        CEO ceo = new CEO("Zbyszek");
        company.hireCeo(ceo);

        AbstractManager manager1 = new FixedEmployeeNumberManager("Maciek", 30000, 4, new AnnualSalary(), new EmploymentContract());
        ceo.addManager(manager1);

        AbstractManager manager2 = new FixedBudgetManager("Krzysiek", 25000, 400000, new AnnualSalary(), new EmploymentContract());
        ceo.addManager(manager2);

        Employee employee1 = new Employee("Wacek", 2000, new BonusToSalary(), new PolicyB2B());
        Employee employee2 = new Employee("Leszek", 3500, new AnnualSalary(), new EmploymentContract());
        Employee employee3 = new Employee("Grzesiek", 25000, new BonusToSalary(), new PolicyB2B());
        manager1.hireEmployee(employee1);

        manager1.hireEmployee(employee2);
        manager1.hireEmployee(employee3);

        Employee employee4 = new Employee("Frodo", 9800, new AnnualSalary(), new EmploymentContract());
        manager2.hireEmployee(employee4);

        System.out.println(company);


    }
}
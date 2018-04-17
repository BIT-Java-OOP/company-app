package bit.javaoop;

import bit.javaoop.company.*;
import bit.javaoop.employmentpolicy.B2b;
import bit.javaoop.employmentpolicy.EmploymentContract;
import bit.javaoop.salarycalculator.ExtraSalary;
import bit.javaoop.salarycalculator.NormalSalary;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marek", 5_000, new B2b(), new NormalSalary());
        Employee employee2 = new Employee("Kuba", 10_000, new B2b(), new ExtraSalary());
        Employee employee3 = new Employee("Ania", 15_000, new EmploymentContract(), new NormalSalary());
        Employee employee4 = new Employee("Szymon", 20_000, new EmploymentContract(), new ExtraSalary());

        AbstractManager manager1 = new FixedBudgetManager("Jan", 25_000, new B2b(), new ExtraSalary(), 20_000);
        AbstractManager manager2 = new FixedEmployeeNumberManager("Pawel", 30_000, new EmploymentContract(), new NormalSalary(), 2);

        CEO ceo = new CEO("Krzysiek");
        Company company = new Company("EasySoft");

        company.hireCEO(ceo);

        ceo.hireManager(manager1);
        ceo.hireManager(manager2);

        manager1.hireIfPossible(employee1);
        manager1.hireIfPossible(employee2);

        manager2.hireIfPossible(employee3);
        manager2.hireIfPossible(employee4);

        System.out.println(company.toString());
    }

}

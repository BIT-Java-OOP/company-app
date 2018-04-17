package bit.javaoop.company;

import bit.javaoop.employmentpolicy.EmploymentPolicy;
import bit.javaoop.salarycalculator.SalaryCalculator;

public class Employee extends AbstractEmployee {

    private final static int SATISFYING_SALARY = 10_000;

    public Employee(String name, double salary, EmploymentPolicy employmentPolicy, SalaryCalculator salaryCalculator) {
        super(name, salary, employmentPolicy, salaryCalculator);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY;
    }
}

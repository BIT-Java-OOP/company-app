package bit.javaoop.company;


import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.policy.EmploymentPolicy;

public class Employee extends AbstractEmployee {


    public Employee(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        super(name, salary, salaryCalculator, employmentPolicy);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }
}
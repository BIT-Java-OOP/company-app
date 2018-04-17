package bit.javaoop.workers;

import bit.javaoop.salary.SalaryCalculator;

public class Employee extends AbstractEmployee {
    
    public Employee(String name, double salary, SalaryCalculator salaryCalculator) {
        super(name, salary, salaryCalculator);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }
}

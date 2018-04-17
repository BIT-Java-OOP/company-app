package bit.javaoop.company;

import bit.javaoop.employmentpolicy.EmploymentPolicy;
import bit.javaoop.salarycalculator.SalaryCalculator;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private EmploymentPolicy employmentPolicy;
    private SalaryCalculator salaryCalculator;

    public AbstractEmployee(String name, double salary, EmploymentPolicy employmentPolicy, SalaryCalculator salaryCalculator) {
        this.name = name;
        this.salary = salary;
        this.employmentPolicy = employmentPolicy;
        this.salaryCalculator = salaryCalculator;
    }

    public abstract boolean isSatisfied();

    public double getSalary() {
        return salaryCalculator.getActualSalary(salary);
    }

    public String getName() {
        return name;
    }
}

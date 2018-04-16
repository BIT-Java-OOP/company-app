package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.employment.EmploymentPolicy;

public abstract class AbstractEmployee {

    private double salary;
    private String name;
    private EmploymentPolicy employmentPolicy;
    private SalaryCalculator salaryCalculator;

    public AbstractEmployee(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        this.name = name;
        this.salary = salary;
        this.salaryCalculator = salaryCalculator;
        this.employmentPolicy = employmentPolicy;
    }

    public EmploymentPolicy getEmploymentPolicy() {
        return employmentPolicy;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salaryCalculator.getActualSalary(salary);
    }

}

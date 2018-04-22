package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.policy.EmploymentPolicy;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private SalaryCalculator salaryCalculator;
    private EmploymentPolicy employmentPolicy;


    public AbstractEmployee(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        this.name = name;
        this.salary = salary;
        this.salaryCalculator = salaryCalculator;
        this.employmentPolicy = employmentPolicy;
    }

    public abstract boolean isSatisfied();
    //  { return salary > 10_000;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmploymentPolicy getEmploymentPolicy(){
        return employmentPolicy;
    }
}
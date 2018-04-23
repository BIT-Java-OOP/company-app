package bit.javaoop;

import bit.javaoop.salary.SalaryCalculator;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private SalaryCalculator salaryCalculator;


    public AbstractEmployee(String name, double salary, SalaryCalculator salaryCalculator) {
        this.name = name;
        this.salary = salary;
        this.salaryCalculator=salaryCalculator;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
       return salaryCalculator.getActualSalary(salary);
    }
}

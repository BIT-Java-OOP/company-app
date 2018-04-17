package bit.javaoop.workers;

import bit.javaoop.salary.HasSalary;
import bit.javaoop.salary.SalaryCalculator;

public abstract class AbstractEmployee implements HasSalary {

    private String name;
    private double salary;
    private SalaryCalculator salaryCalculator;

    public AbstractEmployee(String name, double salary, SalaryCalculator salaryCalculator) {
        this.name = name;
        this.salary = salary;
        this.salaryCalculator = salaryCalculator;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return salaryCalculator.getActualSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

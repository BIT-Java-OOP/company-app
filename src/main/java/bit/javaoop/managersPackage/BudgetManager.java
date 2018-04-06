package bit.javaoop.managersPackage;

import bit.javaoop.employeesPackage.Employee;

public class BudgetManager extends Manager {
    private double budget;
    private double budgetLeft = budget;

    public BudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    public double satisfyingSalary = 20_000;

    @Override
    public boolean canHireEmployee(Employee employee) {
        return budgetLeft >= 0;
    }

    public boolean isSatisfied() {
        return getSalary() > satisfyingSalary && budgetLeft < 15_000;
    }

}


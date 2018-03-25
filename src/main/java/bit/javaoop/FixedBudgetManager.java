package bit.javaoop;

import java.util.ArrayList;

public class FixedBudgetManager extends AbstractManager {
    private double budget;

    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
        this.employees = new ArrayList<>();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return employee.getSalary() < getBudget();
    }

    @Override
    public void hire(AbstractEmployee employee) {
        this.employees.add(employee);
        setBudget(getBudget() - employee.getSalary());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getBudget() < 15_000;
    }
}

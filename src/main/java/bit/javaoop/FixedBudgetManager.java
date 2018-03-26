package bit.javaoop;

import java.util.List;

public class FixedBudgetManager extends Manager {
    private double budget;

    public FixedBudgetManager(int salary, String name, double budget) {
        super(salary, name);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (this.budget < 15_000 && this.getSalary() > 20_000);
    }

    private double sum_salaries() {
        double result = 0;
        for (Employee x : this.getHired_employees()) {
            result += x.getSalary();
        }
        return result;
    }

    @Override
    public void hire(Employee new_employee) {
        if (this.canHire()) {
            this.getHired_employees().add(new_employee);
            budget -= new_employee.getSalary();
        } else {
            System.out.print("Too many employees!");
        }
    }

    @Override
    public boolean canHire() {
        return (this.sum_salaries() < this.budget);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

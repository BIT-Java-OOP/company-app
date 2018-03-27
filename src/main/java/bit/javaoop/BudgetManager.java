package bit.javaoop;

import static com.sun.tools.doclint.Entity.and;

public class BudgetManager extends Manager {
    private double budget;
    private double budgetLeft;

    public BudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    @Override
    public boolean canHireEmployee(Employee employee) {
        return budgetLeft>=0;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000; and budgetLeft; < 15_000;
    }

}


package bit.javaoop.managersPackage;

public class BudgetManager extends Manager {
    public BudgetManager(String name, double salary, double budget, double employeesLimit) {
        super(name, salary, budget, employeesLimit);
        this.satisfyingSalary = 20_000;
    }

    private double budgetLeft = budget;


    @Override
    public boolean canHireEmployee() {
        return budgetLeft >= 0;
    }

    public boolean isSatisfied() {
        return getSalary() > satisfyingSalary && budgetLeft < 15_000;
    }

}


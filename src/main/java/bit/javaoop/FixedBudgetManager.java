package bit.javaoop;

public class FixedBudgetManager extends Manager {
    private double budget = 100_000;
    private double totalSalaries = 0;

    public FixedBudgetManager(String name, double salary) {
        super(name, salary);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getTotalSalaries() {
        return totalSalaries;
    }

    public void FixedBudgetHiring(Employee employee) {
        if (getTotalSalaries() + employee.getSalary() < getBudget())
            Hire(employee);
        else
            System.out.println("Cannot hire " + employee.getName());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getBudget() - getTotalSalaries() > 15_000;
    }

    @Override
    public String toString() {
        return "FixedBudgetManager " + getName();
    }
}

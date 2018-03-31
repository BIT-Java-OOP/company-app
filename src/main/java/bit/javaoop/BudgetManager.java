package bit.javaoop;

public class BudgetManager extends Manager {

    private double budget;

    public BudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (this.getSalary() > 20_000 && this.budget - this.getSumOfEmployeesSalaries() < 15_000);
    }

    @Override
    public boolean canHire(Employee employee) {
        return (this.getSumOfEmployeesSalaries() + employee.getSalary() <= budget);
    }
}

package bit.javaoop;

public class FixedBudgetManager extends Manager {
    private double budget;

    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return this.getSalary() > 20_000 && this.budget - super.myEmployeesSalaries() <= 15_000;
    }

    @Override
    public void hireEmployee(Employee newCandidate) {
        super.hireEmployee(newCandidate);
    }

    @Override
    public boolean canHire(Employee newCandidate) {
        return super.myEmployeesSalaries() + newCandidate.getSalary() <= this.budget;
    }
}

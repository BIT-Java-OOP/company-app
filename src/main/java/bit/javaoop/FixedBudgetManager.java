package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {

    private double budget;

    public double getBudget() { return budget;}

    public FixedBudgetManager(String name, double salary, int budget) {
        super(name, salary);
        this.budget  = budget;
    }

    @Override
    public boolean canHireEmployees() {
        return getSalariesSum() <= budget;
    }

    private Double getSalariesSum() {
        return getEmployees().stream().map(AbstractEmployee::getSalary).reduce( 0.0, ((a, b) -> a+b));
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && budget - getSalariesSum() < 15_000;
    }
}

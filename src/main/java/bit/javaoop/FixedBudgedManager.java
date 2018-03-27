package bit.javaoop;

public class FixedBudgedManager extends Manager {
    public static final int satisfyingSalary = 20000;
    public static final int satysfyingBudget = 15000;
    private double budget;

    public FixedBudgedManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > satisfyingSalary && getBudget() < satysfyingBudget);
    }

    @Override
    public boolean canHire(AbstractEmployee e1) {
        int sum = 0;
        for (int i = 0; i < getEmployees_list().size(); i++) {
            sum += getEmployees_list().get(i).getSalary();
        }
        sum += e1.getSalary();
        return sum < getBudget();
    }

}

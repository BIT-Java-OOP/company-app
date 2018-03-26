package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {
    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.maxbudget=budget;
    }
    private double maxbudget;

    @Override
    public boolean canhire(AbstractEmployee employee) {
        return (maxbudget >= getbudget() + employee.getSalary());
    }

    @Override
    public void hire(AbstractEmployee employee) {
        if (canhire(employee)) employees.add(employee);
    }
    @Override
    public boolean isSatisfied() {
        return (maxbudget-getbudget()<15000 && getSalary()>20000);
    }
}

package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {
    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.maxBudget = budget;
    }

    private double maxBudget;

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return (maxBudget >= getEmployeeSalaty() + employee.getSalary());
    }

    @Override
    public void hireIfPossible(AbstractEmployee employee) {
        if (canHire(employee)) employees.add(employee);
    }

    @Override
    public boolean isSatisfied() {
        return (getActualBudget() < 15000 && getSalary() > 20000);
    }

    public double getActualBudget() {
        return (maxBudget - getEmployeeSalaty());
    }
}

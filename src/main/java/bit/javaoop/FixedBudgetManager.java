package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {

    private double maxBudget;

    public FixedBudgetManager(String name, double salary, double maxBudget) {
        super(name, salary);
        this.maxBudget = maxBudget;
    }

    @Override
    public boolean canHireEmployee(AbstractEmployee employee) {
        return (getBudget() + employee.getSalary()) <= maxBudget;
    }

    @Override
    public void hireEmployee(AbstractEmployee employee) {
        if (canHireEmployee(employee)) employees.add(employee);
    }

    @Override
    public boolean isSatisfied() {
        boolean salarySatisfaction = getSalary() > 20000;
        boolean budgetSatisfaction = (maxBudget - getBudget()) < 15000;
        return salarySatisfaction && budgetSatisfaction;
    }
}

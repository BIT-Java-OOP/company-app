package bit.javaoop;

public class FixedBudgetManager extends Manager {

    private static final int SATISFYING_SALARY = 20_000;
    private static final int SPARE_BUDGET_LIMIT = 15_000;
    private double fixedBudget;

    public FixedBudgetManager(String name, double salary) {
        super(name, salary);
    }

    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY && (currentBudget() < SPARE_BUDGET_LIMIT);
    }

    @Override
    public boolean hireNewEmployee(Employee employee) {
        if ((currentStuffSalary() + employee.getSalary()) <= getFixedBudget()) {
            getMyStaffList().add(employee);
            return true;
        } else {
            System.out.println("You don't have enought money to hire new employee.");
            return false;
        }
    }

    private double currentStuffSalary() {
        double sum = 0;
        for (Employee employee : getMyStaffList()) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private double currentBudget() {
        return (getFixedBudget() - currentStuffSalary());

    }

    private double getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(double fixedBudget) {
        this.fixedBudget = fixedBudget;
    }
}

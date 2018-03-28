package bit.javaoop;

public class FixedBudgetManager extends Manager {

    public static final int BUDGET_INIT = 20000;
    public static final int MIN_OK_SALARY = 20000;
    public static final int MAX_OK_BUDGET = 15000;
    private double budget;

    FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    public FixedBudgetManager(String name, double salary) {
        this(name, salary, BUDGET_INIT);
    }

    @Override
    public boolean isSatisfied() {

        return (getSalary() > MIN_OK_SALARY) && (getBudget() < MAX_OK_BUDGET);
    }

    @Override
    public boolean canHireEmployee(Employee newEmployee) {
        double sum = newEmployee.getSalary();
        for (Employee temp : getEmployees()
                ) {
            sum += temp.getSalary();
        }
        return sum <= getBudget();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

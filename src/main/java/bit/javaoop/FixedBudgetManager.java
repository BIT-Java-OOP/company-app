package bit.javaoop;

public class FixedBudgetManager extends Manager {

    private double budget;

    FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    public FixedBudgetManager(String name, double salary) {
        this(name, salary, 20000);
    }

    @Override
    public boolean isSatisfied() {

        return getSalary() > 20000 && getBudget() < 15000;
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

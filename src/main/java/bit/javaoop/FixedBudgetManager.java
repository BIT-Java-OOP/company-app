package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {

    public FixedBudgetManager(String name, double salary, double fixedBudget) {
        super(name, salary);
        this.fixedBudget = fixedBudget;
    }

    private double fixedBudget;

    private double getEmployeesSalary() {
        double sumOfEmployeesSalary = 0;
        for (AbstractEmployee employee : getListOfEmployees())
            sumOfEmployeesSalary += employee.getSalary();
        return sumOfEmployeesSalary;
    }

    @Override
    public boolean canHireNewEmployee() {
        return (getActualBudget()) >= 0;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000 && getActualBudget() < 15_000);
    }

    private double getActualBudget() {
        return fixedBudget - getEmployeesSalary();
    }
}

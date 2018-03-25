package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {

    public FixedBudgetManager(String name, double salary, double fixedBudget) {
        super(name, salary);
        this.fixedBudget = fixedBudget;
    }

    private double fixedBudget;

    public double getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(double fixedBudget) {
        this.fixedBudget = fixedBudget;
    }

    private double sumOfEmployeesSalary() {
        double sumOfEmployeesSalary = 0;
        for (AbstractEmployee employee : getListOfEmployees())
            sumOfEmployeesSalary += employee.getSalary();
        return sumOfEmployeesSalary;
    }

    @Override
    public boolean canHireNewEmployee() {
        return (fixedBudget - sumOfEmployeesSalary()) >= 0;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000 && (fixedBudget - sumOfEmployeesSalary()) < 15_000);
    }
}

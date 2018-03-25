package bit.javaoop;

public class FixedBudgetManager extends Manager {
    private double budget;

    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
    }

    public double getCurrentEmployeesSalary() {
        double salaries = 0;
        for (Employee employees : getEmployeeList()) {
            salaries += employees.getSalary();
        }
        return salaries;
    }

    @Override
    public boolean canHireEmployee(Employee employee) {

        return budget > getCurrentEmployeesSalary() + employee.getSalary();
    }

    @Override
    public void hireEmployee(Employee employee) {
        if (canHireEmployee(employee)) {
            getEmployeeList().add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && budget - getCurrentEmployeesSalary() < 15_000;
    }
}

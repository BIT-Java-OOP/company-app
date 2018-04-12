package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {

    private int employeesLimit;

    public int getEmployeesLimit() {
        return employeesLimit;
    }

    public FixedEmployeeNumberManager(String name, double salary, int employeesLimit) {
        super(name, salary);
        this.employeesLimit = employeesLimit;
    }

    @Override
    public boolean canHireEmployees() {
        return employeesLimit > getEmployees().size();
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && !canHireEmployees();
    }
}

package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    private int employeesMaxCount;

    public FixedEmployeeNumberManager(String name, double salary, int employeesMaxCount) {
        super(name, salary);
        this.employeesMaxCount = employeesMaxCount;
    }

    public int getEmployeesMaxCount() {
        return employeesMaxCount;
    }

    public void setEmployeesMaxCount(int employeesMaxCount) {
        this.employeesMaxCount = employeesMaxCount;
    }

    @Override
    public boolean canHireNewEmployee() {
        return getListOfEmployees().size() < employeesMaxCount;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getListOfEmployees().size() == employeesMaxCount;
    }
}

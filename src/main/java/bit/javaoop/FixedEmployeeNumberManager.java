package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int maxEmployeesNumber;

    public FixedEmployeeNumberManager(String name, double salary, int maxEmployeesNumber) {
        super(name, salary);
        this.maxEmployeesNumber = maxEmployeesNumber;
    }

    @Override
    public boolean canHireEmployee(Employee employee) {
        return getEmployeeList().size() < maxEmployeesNumber;
    }

    @Override
    public void hireEmployee(Employee employee) {
        if (canHireEmployee(employee)) {
            getEmployeeList().add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getEmployeeList().size() == maxEmployeesNumber;
    }
}

package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int employeesLimit = 10;
    private int totalEmployees = 0;

    public FixedEmployeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    public int getEmployeesLimit() {
        return employeesLimit;
    }

    public void setEmployeesLimit(int employeesLimit) {
        this.employeesLimit = employeesLimit;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void EmployeesLimitHiring(Employee employee) {
        if (getTotalEmployees() < getEmployeesLimit())
            Hire(employee);
        else
            System.out.println("Cannot hire " + employee.getName());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getTotalEmployees() == 0;
    }

    @Override
    public String toString() {
        return "FixedEmployeeNumberManager " + getName();
    }
}

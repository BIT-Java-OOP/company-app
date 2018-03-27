package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private static final int SATISFYING_SALARY = 20_000;
    private int employeeLimit;

    FixedEmployeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY && getEmployeeLimit() == currentEmployeeNumber();
    }

    @Override
    public boolean hireNewEmployee(Employee employee) {
        if (this.currentEmployeeNumber() <= this.getEmployeeLimit()) {
            this.getMyStaffList().add(employee);
            return true;
        } else {
            System.out.println("You have already reached employee limit");
            return false;
        }

    }

    private int currentEmployeeNumber() {
        return this.getMyStaffList().size();
    }

    public int getEmployeeLimit() {
        return employeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        this.employeeLimit = employeeLimit;
    }

}


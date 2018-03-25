package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int employeeLimit;

    FixedEmployeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        if (this.getSalary() > 20_000 && this.getEmployeeLimit() == this.currentEmployeeNumber()) {
            return true;
        } else {
            return false;
        }
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

    public int currentEmployeeNumber() {
        return this.getMyStaffList().size();
    }

    public int getEmployeeLimit() {
        return employeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        this.employeeLimit = employeeLimit;
    }

}


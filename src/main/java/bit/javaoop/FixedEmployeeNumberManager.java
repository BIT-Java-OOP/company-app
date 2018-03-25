package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    private int hiredEmployees;
    private int employeeLimit;

    public FixedEmployeeNumberManager(String name, double salary, int employeeLimit) {
        super(name, salary);
        this.employeeLimit = employeeLimit;
        this.hiredEmployees = 0;
    }

    public int getEmployeeLimit() {
        return employeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        this.employeeLimit = employeeLimit;
    }

    public int getHiredEmployees() {
        return hiredEmployees;
    }

    public void setHiredEmployees(int hiredEmployees) {
        this.hiredEmployees = hiredEmployees;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return getHiredEmployees() < getEmployeeLimit();
    }

    @Override
    public void hire(AbstractEmployee employee) {
        this.employees.add(employee);
        setHiredEmployees(getHiredEmployees() + 1);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getHiredEmployees() == getEmployeeLimit();
    }
}

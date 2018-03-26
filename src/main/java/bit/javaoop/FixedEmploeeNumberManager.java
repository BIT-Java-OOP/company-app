package bit.javaoop;

public class FixedEmploeeNumberManager extends Manager {

    private int EmployeeLimit = 15;

    public FixedEmploeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean canHire(Employee e) {
        return EmployeeLimit>0;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20000 && EmployeeLimit ==0);
    }

    @Override
    public void hire(Employee e) {
        super.hire(e);
        EmployeeLimit--;
    }

    public int getEmployeeLimit() {
        return EmployeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        EmployeeLimit = employeeLimit;
    }
}

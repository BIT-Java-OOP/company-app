package bit.javaoop;

public class FixedEmploeeNumberManager extends AbstractManager {

    private int employeeLimit = 15;

    public FixedEmploeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean canHire(Employee e) {
        return employeeLimit > 0;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20000 && employeeLimit == 0);
    }

    @Override
    public void hire(Employee e) {
        super.hire(e);
        employeeLimit--;
    }

    public int getEmployeeLimit() {
        return employeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        this.employeeLimit = employeeLimit;
    }
}

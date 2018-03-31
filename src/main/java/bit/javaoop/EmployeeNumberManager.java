package bit.javaoop;

public class EmployeeNumberManager extends Manager {

    private int spots;

    public EmployeeNumberManager(String name, double salary, int spots) {
        super(name, salary);
        this.spots = spots;
    }

    @Override
    public boolean isSatisfied() {
        return (this.getSalary() > 20_000 && spots - this.countEmployees() == 0);
    }

    @Override
    public boolean canHire(Employee employee) {
        return (spots - this.countEmployees() > 0);
    }
}

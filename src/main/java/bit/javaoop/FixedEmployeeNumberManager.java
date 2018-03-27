package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    int maxEmployees;

    public FixedEmployeeNumberManager(String name, double salary, int maxEmployees) {
        super(name, salary);
        this.maxEmployees = maxEmployees;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return (getEmployyesNumer() < maxEmployees);
    }

    @Override
    public void hireIfPossible(AbstractEmployee employee) {
        if (canHire(employee)) employees.add(employee);
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() >= 20000 && maxEmployees == getEmployyesNumer());
    }
}

package bit.javaoop;

import java.util.LinkedList;

public abstract class Manager extends AbstractEmployee {
    private final LinkedList<Employee> employees;

    public Manager(String name, double salary) {
        super(name, salary);
        employees = new LinkedList<>();
    }

    @Override
    abstract public boolean isSatisfied();

    abstract public boolean canHire(Employee employee);

    abstract public void hireNewEmployee(Employee employee);

    @Override
    public String toString() {
        return getName() + " Manager";
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }
}

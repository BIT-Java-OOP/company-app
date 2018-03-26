package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {
    protected List<AbstractEmployee> employees;

    public AbstractManager(String name, double salary) {
        super(name, salary);
        employees = new ArrayList<>();

    }

    public List<AbstractEmployee> getEmployees() {
        return employees;
    }

    public void addEmployee(AbstractEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(AbstractEmployee employee) {
        employees.remove(employee);
    }

    public abstract boolean canHireEmployees();

    @Override
    public String toString() {
        return getName() + " - Manager";
    }
}

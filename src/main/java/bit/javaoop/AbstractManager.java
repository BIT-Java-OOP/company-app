package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {
    public AbstractManager(String name, double salary) {
        super(name, salary);
    }

    public List<AbstractEmployee> getEmployees() {
        return employees;
    }

    protected List<AbstractEmployee> employees = new LinkedList<>();

    public abstract boolean canHire(AbstractEmployee employee);

    public double getEmployeeSalaty() {
        double budget = 0;
        for (AbstractEmployee e : employees) {
            budget += e.getSalary();
        }
        return budget;
    }

    public int getEmployyesNumer() {
        return employees.size();
    }

    public abstract void hireIfPossible(AbstractEmployee employee);
}

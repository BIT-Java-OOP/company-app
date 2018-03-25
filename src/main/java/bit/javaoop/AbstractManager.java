package bit.javaoop;

import java.util.ArrayList;

public abstract class AbstractManager extends AbstractEmployee {
    protected ArrayList<AbstractEmployee> employees;

    public AbstractManager(String name, double salary) {
        super(name, salary);
        this.employees = new ArrayList<>();
    }

    public ArrayList<AbstractEmployee> getEmployees() {
        return employees;
    }

    public abstract boolean canHire(AbstractEmployee employee);
    public abstract void hire(AbstractEmployee employee);
}

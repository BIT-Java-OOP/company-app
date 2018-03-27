package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {
    private List<AbstractEmployee> employees_list = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public abstract boolean canHire(AbstractEmployee e1);

    public void hire(AbstractEmployee e1) {
        if (canHire(e1)) {
            getEmployees_list().add(e1);
        }
    }

    public List<AbstractEmployee> getEmployees_list() {
        return employees_list;
    }

    public String toString() {
        return getName() + " - Manager";
    }
}

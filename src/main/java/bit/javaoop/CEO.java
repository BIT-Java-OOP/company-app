package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Employee {

    private List<Manager> managers;

    public CEO(String name, double salary) {
        super(name, salary);
        this.managers = new ArrayList();
    }

    public List<Manager> getManagers() {
        return this.managers;
    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }
}

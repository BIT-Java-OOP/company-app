package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class CEO {
    private String name;
    private List<AbstractManager> managers = new LinkedList<>();

    public CEO(String name) {
        this.name = name;
    }

    public void addManager(AbstractManager manager) {
        managers.add(manager);
    }

    public String getName() {
        return name;
    }

    public List<AbstractManager> getManagers() {
        return managers;
    }
}

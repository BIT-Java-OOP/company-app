package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    private String name;
    private ArrayList<AbstractManager> managers;

    public CEO(String name) {
        this.name = name;
        this.managers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AbstractManager> getManagers() {
        return managers;
    }

    public void hireManager(AbstractManager manager) {
        this.managers.add(manager);
    }
}

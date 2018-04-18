package bit.javaoop.headquarters;

import bit.javaoop.managers.AbstractManager;

import java.util.ArrayList;

public class CEO {
    private String name;
    private ArrayList<AbstractManager> managersList;

    public CEO(String name) {
        this.name = name;
        this.managersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<AbstractManager> getManagersList() {
        return new ArrayList<>(managersList);
    }

    public void hireManagers(AbstractManager manager) {
        managersList.add(manager);
    }
}

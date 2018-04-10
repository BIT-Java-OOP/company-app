package bit.javaoop.headquartersPackage;

import bit.javaoop.managersPackage.Manager;

import java.util.ArrayList;

public class CEO {
    private String name;

    public CEO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static ArrayList<Manager> managersList;

    public void hireManagersIfPossible(Manager manager) {
        managersList.add(manager);
    }
}

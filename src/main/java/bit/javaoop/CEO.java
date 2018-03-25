package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    String name;
    ArrayList<Manager> managerList;

    public CEO(String name) {
        this.name = name;
        this.managerList = new ArrayList<>();
    }

    public void hireManager(Manager manager) {
        managerList.add(manager);
    }

}

package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    private List<Manager> managerList;

    public CEO(String name) {
        this.name = name;
        this.managerList = new ArrayList<>();
    }

    public void hireManager(Manager manager) {
        managerList.add(manager);
    }

    public String getName() {
        return name;
    }

    public List<Manager> getManagerList() {
        return managerList;
    }
}

package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {

    private String name;
    private List<Manager> managersList;

    CEO(String name, List<Manager> managersList) {
        this.name = name;
        this.managersList = managersList;
    }

    CEO(String name) {
        this(name, new ArrayList<>());
    }

    CEO() {
        this("", new ArrayList<>());
    }

    CEO(String name, CEO oldCeo) {
        this(name, oldCeo.getManagersList());
    }

    public void hireManager(Manager newManager) {
        getManagersList().add(newManager);
    }

    @Override
    public String toString() {
        return getName()+" - CEO";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Manager> getManagersList() {
        return managersList;
    }

    public void setManagersList(List<Manager> managersList) {
        this.managersList = managersList;
    }
}

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
        this(name, new ArrayList<Manager>());
    }

    CEO() {
        this(null, new ArrayList<Manager>());
    }

    CEO(String name, CEO oldCeo) {
        this(name, oldCeo.getManagersList());
    }

    public void hireManager(Manager newManager) {
        getManagersList().add(newManager);
    }

    @Override
    public String toString() {
        StringBuilder ceo = new StringBuilder("\t" + getName() + " - CEO\n");
        for (Manager temp : getManagersList()
                ) {
            ceo.append(temp.toString());
        }
        return ceo.toString();
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

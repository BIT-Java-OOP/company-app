package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    private List<Manager> managers;

    public CEO(String name) {
        this.name = name;
        this.managers = new ArrayList<Manager>();
        this.managers.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}

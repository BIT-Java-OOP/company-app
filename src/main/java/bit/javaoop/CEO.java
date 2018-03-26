package bit.javaoop;

import java.util.LinkedList;

public class CEO {
    private String name;
    private LinkedList<Manager> managers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Manager> getManagers() {
        return managers;
    }
}

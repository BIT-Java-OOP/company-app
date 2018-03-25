package bit.javaoop;

import java.util.ArrayList;

public class CEO {

    private String name;

    private ArrayList<Manager> Managers = new ArrayList<>();

    public CEO(String name){ this.name = name; }

    public CEO addManager(Manager m) {
        Managers.add(m);
        return this;
    }

    public ArrayList<Manager> getManagers() {
        return Managers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package bit.javaoop.workers;

import java.util.ArrayList;

public class CEO {

    private String name;

    private ArrayList<AbstractManager> Managers = new ArrayList<>();

    public CEO(String name){ this.name = name; }

    public CEO addManager(AbstractManager m) {
        Managers.add(m);
        return this;
    }

    public ArrayList<AbstractManager> getManagers() {
        return Managers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

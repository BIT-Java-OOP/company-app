package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class Ceo {
    private final String name;
    private List<AbstractManager> managers;

    public Ceo(String name) {
        this.name = name;
        managers = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setManagers(List<AbstractManager> managers) {
        this.managers = managers;
    }

    public void addManager(AbstractManager manager) {
        this.managers.add(manager);
    }

    public List<AbstractManager> getManagers() {
        return managers;
    }

    @Override
    public String toString() {
        return name + " - CEO";
    }
}

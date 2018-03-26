package bit.javaoop.people;

import java.util.ArrayList;
import java.util.List;

public class Ceo extends AbstractEmployee {

    private List<Manager> managers;

    public Ceo(String name, double salary) {
        super(name, salary);
        managers = new ArrayList<>();
    }

    @Override
    public boolean isSatisfied() {
        return true;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }


}

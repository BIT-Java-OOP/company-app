package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Ceo {
    private String name;
     List<String> managers = new ArrayList<String>();

    Ceo(String name, ArrayList<String> managers) {
        this.name = name;
        this.managers = Manager.managers;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<String> managers) {
        this.managers = managers;
    }
}

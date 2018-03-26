package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {

    private String name;

    private List<AbstractManager> managers;

    public CEO(String name) {
        this.name = name;
        this.managers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractManager> getManagers() {
        return managers;
    }

    public void setManagers(List<AbstractManager> managers) {
        this.managers = managers;
    }

}

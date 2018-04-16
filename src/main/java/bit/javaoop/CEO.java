package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    private List<AbstractManager> listOfManagers = new ArrayList<>();

    public CEO(String name) {
        this.name = name;
    }

    public List<AbstractManager> getListOfManagers() {
        return listOfManagers;
    }

    public void hireManager(AbstractManager manager) {
        listOfManagers.add(manager);
    }

    public String getName() {
        return name;
    }
}

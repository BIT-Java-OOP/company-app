package bit.javaoop;

import java.util.ArrayList;

public class CEO {

    private ArrayList<Manager> Managers = new ArrayList<>();

    public void addManager(Manager m) {
        Managers.add(m);
    }
}

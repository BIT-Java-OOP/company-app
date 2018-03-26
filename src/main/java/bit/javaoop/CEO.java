package bit.javaoop;

import java.util.List;


public class CEO {

    private String name;
    private List<Manager> listOfManagers;

    public CEO(String name,List<Manager> listOfManagers) {
        this.name = name;
        this.listOfManagers = listOfManagers;
    }

    public String getName() {
        return name;
    }

    public List<Manager> getListOfManagers() {
        return listOfManagers;
    }

    public void hireAManager(Manager manager) {
        listOfManagers.add(manager);
    }

}

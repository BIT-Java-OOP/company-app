package bit.javaoop.company.manager;


import bit.javaoop.company.manager.AbstractManager;

import java.util.List;


public class CEO {

    private String name;
    private List<AbstractManager> listOfManagers;

    public CEO(String name,List<AbstractManager> listOfManagers) {
        this.name = name;
        this.listOfManagers = listOfManagers;
    }


    public String getName() {
        return name;
    }

    public List<AbstractManager> getListOfManagers() {
        return listOfManagers;
    }

    public void hireAManager(AbstractManager manager) {
        listOfManagers.add(manager);
    }

}

package bit.javaoop.company;

import bit.javaoop.company.AbstractManager;

import java.util.ArrayList;

public class CEO {

    private String name;
    private ArrayList<AbstractManager> managersList;

    public CEO(String name) {
        this.name = name;
        this.managersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getManagersQuantity() {
        return managersList.size();
    }

    public ArrayList<AbstractManager> getManagersList(){
        return managersList;
    }

    public void addManager(AbstractManager manager) {
        managersList.add(manager);
    }

}
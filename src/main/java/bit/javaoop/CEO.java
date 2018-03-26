package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    private ArrayList<AbstractEmployee> listOfEmployees = new ArrayList<>();
    private String name;

    public CEO(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public ArrayList<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void addEmployee(AbstractEmployee name) {
        listOfEmployees.add(name);
    }

}
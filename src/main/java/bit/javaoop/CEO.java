package bit.javaoop;

import java.util.LinkedList;

public class CEO {
    private String name;
    private LinkedList<Manager> managers;
    private double salary;

    public CEO(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.managers = new LinkedList<>();
    }

    @Override
    public String toString() {
        return name + " CEO";
    }

    public LinkedList<Manager> getManagers() {
        return managers;
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    public void setManagers(LinkedList<Manager> managers) {
        this.managers = managers;
    }

}


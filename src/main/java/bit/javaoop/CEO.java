package bit.javaoop;

import java.util.List;

public class CEO{
    List<Manager> listofManagers;
    String name;
    double salary;

    public CEO(String name, double salary) {
        this.name = name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void HireManager(Manager manager) {listofManagers.add(manager);}

    @Override
    public String toString() {
        String str=name+"- CEO \n";
        for(Manager m:listofManagers) str+=m.toString();
        return str;
    }
}

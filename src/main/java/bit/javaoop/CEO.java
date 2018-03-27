package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    List<Manager> managers_list=new ArrayList<>();

    public CEO(String name) {
        this.name = name;
    }
    public void addManager(Manager manager){
        managers_list.add(manager);
    }

    public List<Manager> getManagers_list() {
        return managers_list;
    }

    public void setManagers_list(List<Manager> managers_list) {
        this.managers_list = managers_list;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return getName() + " - CEO";
    }

}

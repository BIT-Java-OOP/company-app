package bit.javaoop;

import java.util.*;

public class CEO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(List<Manager> managerList) {
        this.managerList = managerList;
    }

    public CEO(String name){
        this.name = name;
    }

    public List<Manager> managerList = new ArrayList<>();

    public void addManager(Manager manager){
        this.managerList.add(manager);
    }


}
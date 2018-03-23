package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    private List<Manager> myManagers;

    public Manager getManager(int i){
        return myManagers.get(i);
    }

    public int howManyManagers(){
        return myManagers.size();
    }

    public String getName() {
        return name;
    }

    public CEO(String name) {
        this.name = name;
        this.myManagers = new ArrayList<>();
    }

    public void hireManager(Manager myManager) {
        myManagers.add(myManager);
    }
}

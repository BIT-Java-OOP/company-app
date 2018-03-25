package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private String name;
    private List<AbstractManager> listOfManagers = new ArrayList<>() {
        @Override
        public String toString() {
            String text = "";
            for(AbstractManager manager : listOfManagers){
                text += manager.toString();
            }
            return text;
        }
    };

    public CEO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractManager> getListOfManagers() {
        return listOfManagers;
    }

    public void hireManagerToList(AbstractManager manager) {
        listOfManagers.add(manager);
    }
}

package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Ceo {
    private String name;
    private List<AbstractManager> managersList;

    public Ceo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setManagersList(List<AbstractManager> managersList) {
        this.managersList = managersList;
    }

    @Override
    public String toString() {
        String  returningStringCeoEmployeeList = getName() + " - CEO\n";
        for (AbstractManager manage : managersList) {
            returningStringCeoEmployeeList += manage.toString();
        }
        return returningStringCeoEmployeeList;
    }
}

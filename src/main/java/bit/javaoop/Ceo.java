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
        StringBuilder returningStringCeoEmployeeList = new StringBuilder(getName() + " - CEO\n");
        for (AbstractManager manage : managersList) {
            returningStringCeoEmployeeList.append(manage.toString());
        }
        return returningStringCeoEmployeeList.toString();
    }
}

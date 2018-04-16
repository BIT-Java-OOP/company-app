package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class ChiefExecutiveOfficer {
    private List<Manager> managerList;
    private final String name;

    public ChiefExecutiveOfficer(String name) {
        this.name = name;
        this.managerList = new LinkedList<Manager>();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append(name);
        string.append(" - CEO\n");

        for (Manager manager : managerList) {
            string.append("\t");
            string.append(manager.getName());
            string.append(" - Manager\n");
            for (Employee employee: manager.getEmployeeList()) {
                string.append("\t\t");
                string.append(employee.getName());
                string.append(" - Employee\n");
            }
        }
        String result = string.toString();
        return result;
    }

    public List<Manager> getManagerList() {
        return managerList;
    }
    public String getName(){
        return name;
    }
}

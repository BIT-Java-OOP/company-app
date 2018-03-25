package bit.javaoop;

import java.util.LinkedList;

public class ChiefExecutiveOfficer extends NamedObject {
    private LinkedList<Manager> managerList;

    public ChiefExecutiveOfficer(String name) {
        super(name);
        this.managerList = new LinkedList<Manager>();
    }

    @Override
    public String toString() {
        StringBuilder resultBuilder = new StringBuilder(getName() + " - CEO\n");
        for (Manager manager : managerList) {
            resultBuilder.append("\t").append(manager.toString().replaceAll("\t", "\t\t")).append("\n");
        }
        String result = resultBuilder.toString();
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public LinkedList<Manager> getManagerList() {
        return managerList;
    }
}

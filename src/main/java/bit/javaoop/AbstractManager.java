package bit.javaoop;

import java.util.ArrayList;

public abstract class AbstractManager extends AbstractEmployee {

    public ArrayList<AbstractEmployee> employeesList;

    public AbstractManager(String name, double salary, ArrayList<AbstractEmployee> employeesList) {
        super(name, salary);
        this.employeesList = new ArrayList<>();
    }

    public ArrayList<AbstractEmployee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<AbstractEmployee> employeesList) {
        this.employeesList = employeesList;
    }

    public String toString(int line) {
        String result = new String();
        result += getName() + " - Manager\n";
        StringBuilder sB = new StringBuilder(result);
        for (AbstractEmployee employee : employeesList) {
            sB.append(employee.toString(line + 1));
        }
        result = sB.toString();
        return result;
    }

    public abstract void hire(AbstractEmployee employee);

    public abstract boolean canHire();
}

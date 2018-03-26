package bit.javaoop;

import java.util.ArrayList;

public abstract class AbstractManager extends AbstractEmployee {

    ArrayList<AbstractEmployee> employeesList;

    public AbstractManager(String name, double salary, ArrayList<AbstractEmployee> employeesList) {
        super(name, salary);
        this.employeesList = employeesList;
    }

    public ArrayList<AbstractEmployee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<AbstractEmployee> employeesList) {
        this.employeesList = employeesList;
    }

    public String toStr(int line) {
        String result = new String();
        for (int i = 0; i < line; i += 1)
            result += '\t';
        result += getName() + " - Manager\n";
        for (AbstractEmployee employee : employeesList) {
            result += employee.toStr(line + 1);
        }
        return result;
    }
}

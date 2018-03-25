package bit.javaoop;

import java.util.ArrayList;

public abstract class AbstractManager extends AbstractEmployee {

    ArrayList<AbstractEmployee> employee_list;

    public AbstractManager(String name, double salary, ArrayList<AbstractEmployee> employee_list) {
        super(name, salary);
        this.employee_list = new ArrayList<>();
    }

    ArrayList<AbstractEmployee> getEmployee_list() {
        return employee_list;
    }

    public void setEmployee_list(ArrayList<AbstractEmployee> employee_list) {
        this.employee_list = employee_list;
    }

    public String toStr(int line) {
        String result = new String();
        for (int i = 0; i < line; i += 1)
            result += '\t';
        result += getName() + " - Manager\n";
        for (AbstractEmployee worker : employee_list) {
            result += worker.toStr(line + 1);
        }
        return result;
    }

}

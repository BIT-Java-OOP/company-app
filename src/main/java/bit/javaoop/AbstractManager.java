package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    public AbstractManager(String name, double salary) {
        super(name, salary);
    }

    private List<AbstractEmployee> listOfEmployees = new ArrayList<>() {
        @Override
        public String toString() {
            String text = "";
            for (AbstractEmployee employee : listOfEmployees) {
                text += employee.toString();
            }
            return text;
        }
    };

    public List<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public abstract boolean canHireNewEmployee();

    public boolean hire(Employee employee) {
        if (canHireNewEmployee()) {
            listOfEmployees.add(employee);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "    " + getName() + " - Manager\n" + listOfEmployees.toString();
    }
}

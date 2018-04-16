package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    public AbstractManager(String name, double salary) {
        super(name, salary);
    }

    private List<AbstractEmployee> listOfEmployees = new ArrayList<>();

    public List<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public abstract boolean canHireNewEmployee();

    public boolean hireIfPossible(Employee employee) {
        if (canHireNewEmployee()) {
            listOfEmployees.add(employee);
            return true;
        } else {
            return false;
        }
    }

}

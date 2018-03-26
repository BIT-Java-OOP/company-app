package bit.javaoop;

import java.util.List;

public abstract class Manager extends AbstractEmployee {

    private List<AbstractEmployee> listOfEmployees;

    public Manager(String name, double salary,List<AbstractEmployee> listOfEmployees) {
        super(name, salary);
        this.listOfEmployees = listOfEmployees;
    }

    public List<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public abstract boolean hire(AbstractEmployee employee);
}

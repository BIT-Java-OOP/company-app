package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Menager extends AbstractEmployee{

    private ArrayList<AbstractEmployee> listOfEmployees;

    Menager(String name, double salary) {
        super(name, salary);
        listOfEmployees = new ArrayList<>();
    }

    ArrayList<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<AbstractEmployee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public abstract boolean hire(AbstractEmployee employee);
}

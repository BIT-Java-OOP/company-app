package bit.javaoop;

import java.util.ArrayList;

public class FixedEmployeeNumberManager extends Manager {


    private int limitOfEmployees;

    public FixedEmployeeNumberManager(String name, double salary, int limitOfEmployees, ArrayList<AbstractEmployee> listOfEmployees) {
        super(name, salary, listOfEmployees);
        this.limitOfEmployees = limitOfEmployees;
    }


    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (limitOfEmployees == listOfEmployees.size());
    }

    @Override
    public boolean canHire() {
        return (limitOfEmployees > listOfEmployees.size());

    }

    @Override
    public void hire(AbstractEmployee employee) {
        {
            if (canHire())
                listOfEmployees.add(employee);
        }
    }
}

package bit.javaoop;

import java.util.ArrayList;

public class CEO {

    private String name;
    private ArrayList<AbstractEmployee> employeesList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public CEO(String name) {
        this.name = name;
    }

    public ArrayList<AbstractEmployee> getEmployees() {
        return employeesList;
    }

    public void addEmployee(AbstractEmployee employee) {
        employeesList.add(employee);

    }
}
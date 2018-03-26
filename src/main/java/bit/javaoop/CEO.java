package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    public CEO(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<AbstractEmployee> employeesList = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AbstractEmployee> getEmployees() {
        return employeesList;
    }

    public void addEmployee(AbstractEmployee employee) {
        employeesList.add(employee);

    }
}
package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    public CEO(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<AbstractEmployee> employee_list = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AbstractEmployee> getEmployee() {
        return employee_list;
    }

    public void addEmployee(AbstractEmployee employee) {
        employee_list.add(employee);

    }
}

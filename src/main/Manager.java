package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends Employee {

    public static int MAX_EMPLOYEE = 5;

    public Manager(String name, double
            salary){
        super(name, salary);
    }

    public List<Employee> employeeList = new ArrayList<>();

    public abstract boolean canHire();
    public abstract void hire(Employee  e);

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


}

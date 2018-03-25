package bit.javaoop;

import java.util.ArrayList;

public abstract class Manager extends AbstractEmployee {

    private ArrayList<Employee> myStaff ;

    Manager(String name, double salary) {
        super(name, salary);
        this.myStaff = new ArrayList<>();

    }

    public abstract boolean hireNewEmployee(Employee employee);

    public abstract boolean isSatisfied();


    public ArrayList<Employee> getMyStaffList() {
        return myStaff;
    }

}

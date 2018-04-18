package bit.javaoop.managers;

import bit.javaoop.employees.AbstractEmployee;
import bit.javaoop.employees.Employee;

import java.util.ArrayList;


public abstract class AbstractManager extends AbstractEmployee {

    protected ArrayList<Employee> employeesList;

    public AbstractManager(String name, double salary) {
        super(name, salary);
        this.employeesList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeesList() {
        return new ArrayList<>(employeesList);
    }

    public abstract boolean canHireEmployee();

    public abstract void hireEmployee(Employee employee);

    @Override
    public String toString() {
        return getName() + " - Manager";
    }
}
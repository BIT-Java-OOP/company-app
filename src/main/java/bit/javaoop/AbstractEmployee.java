package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<Employee>();
    private List<Manager> managers = new ArrayList<Manager>();

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        String employee = new String();
        employee = "\t\t\t" + getName() + " - Employee\n";
        return employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

}

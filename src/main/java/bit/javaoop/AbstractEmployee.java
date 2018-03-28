package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<>();
    //private List<Manager> managers = new ArrayList<>();

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return getName()+" - Employee";
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}

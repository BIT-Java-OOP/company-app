package bit.javaoop.employeesPackage;

import bit.javaoop.managersPackage.Manager;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    public double satisfyingSalary;

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


    public String tellName(Employee employee) {
        return employee.getName() + " - Employee";
    }

    public String tellName(Manager manager) {
        return manager.getName() + " - Manager";
    }
}

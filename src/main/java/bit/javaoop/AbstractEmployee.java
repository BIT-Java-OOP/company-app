package bit.javaoop;

import java.util.ArrayList;

public abstract class AbstractEmployee {
    private String name;
    private double salary;


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


    abstract public String toString(int line);
}

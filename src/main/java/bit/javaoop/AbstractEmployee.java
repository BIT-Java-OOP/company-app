package bit.javaoop;

public abstract class AbstractEmployee {
    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

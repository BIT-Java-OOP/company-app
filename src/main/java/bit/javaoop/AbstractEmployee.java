package bit.javaoop;

public abstract class AbstractEmployee{
    private double salary;
    private final String name;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
}

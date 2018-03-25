package bit.javaoop;

public abstract class AbstractEmployee extends NamedObject {
    private double salary;

    public AbstractEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

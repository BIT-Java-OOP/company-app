package bit.javaoop;

public class Employee extends AbstractEmployee {


    public static final int satisfyingSalary = 10_000;

    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > satisfyingSalary;
    }

    public String toString() {
        return getName() + " - Employee";
    }
}

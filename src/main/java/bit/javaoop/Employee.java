package bit.javaoop;

public class Employee extends AbstractEmployee {


    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override

    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }

    @Override
    public String toString() {
        return getName() + " Employee";
    }
}

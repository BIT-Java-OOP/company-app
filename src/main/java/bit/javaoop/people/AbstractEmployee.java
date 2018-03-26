package bit.javaoop.people;

public abstract class AbstractEmployee {
    private String name;
    private double salary;

    AbstractEmployee(String name, double salary) {
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null!");
        }

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
}

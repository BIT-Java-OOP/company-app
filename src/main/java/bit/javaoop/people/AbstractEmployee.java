package bit.javaoop.people;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEmployee that = (AbstractEmployee) o;
        return Double.compare(that.salary, salary) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

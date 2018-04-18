package bit.javaoop.employees;

public class Employee extends AbstractEmployee {
    private static double SATISFYING_SALARY;

    public Employee(String name, double salary) {
        super(name, salary);
        this.SATISFYING_SALARY = 10_000;
    }

    public static double getSatisfyingSalary() {
        return SATISFYING_SALARY;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY;
    }

    @Override
    public String toString() {
        return getName() + " - Employee";

    }


}

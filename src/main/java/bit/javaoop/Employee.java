package bit.javaoop;

public class Employee extends AbstractEmployee {


    public static final int MIN_OK_SALARY = 10000;

    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > MIN_OK_SALARY;
    }

}

package bit.javaoop.employeesPackage;

public class Employee extends AbstractEmployee {


    public Employee(String name, double salary) {
        super(name, salary);
        this.satisfyingSalary = 10_000;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > satisfyingSalary;
    }


}

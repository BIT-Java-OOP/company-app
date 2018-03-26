package bit.javaoop;

public class Employee extends AbstractEmployee {

    public Employee(String name, double salary) {
        super(name, salary);
    }

    public Employee(String name, double salary, Company company) {
        super(name, salary);
        company.insertToEmployeesList(this);
    }

    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }

}

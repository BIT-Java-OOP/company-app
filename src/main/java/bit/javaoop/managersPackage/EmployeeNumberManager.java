package bit.javaoop.managersPackage;

public class EmployeeNumberManager extends Manager {

    public EmployeeNumberManager(String name, double salary, double budget, double employeesLimit) {
        super(name, salary, budget, employeesLimit);
        this.satisfyingSalary = 20_000;
    }


    @Override
    public boolean canHireEmployee() {
        return employeesLimit > 0;
    }

    public boolean isSatisfied() {
        return employeesLimit <= 0 && getSalary() > satisfyingSalary;
    }
}

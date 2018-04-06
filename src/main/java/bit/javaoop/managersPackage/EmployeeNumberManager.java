package bit.javaoop.managersPackage;

import bit.javaoop.employeesPackage.Employee;

public class EmployeeNumberManager extends Manager {

    public EmployeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    public double satisfyingSalary = 20_000;

    @Override
    public boolean canHireEmployee(Employee employee) {
        return employeesLimit <= 0;
    }

    public boolean isSatisfied() {
        return employeesLimit <= 0 && getSalary() > satisfyingSalary;
    }
}

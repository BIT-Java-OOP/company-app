package bit.javaoop;

public class EmployeeNumberManager extends Manager {
    private double employeelimit;

    @Override
    public boolean canHireEmployee(Employee employee) {
        return employeelimit <= 0;
    }
    @Override
    public boolean isSatisfied() {
        return employeelimit <= 0 && getSalary() > 20_000;
    }
}

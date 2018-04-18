package bit.javaoop.managers;

import bit.javaoop.employees.Employee;

public class EmployeeManager extends AbstractManager {
    private static double SATISFYING_SALARY;
    protected double employeesLimit;

    public EmployeeManager(String name, double salary, double employeesLimit) {
        super(name, salary);
        this.employeesLimit = employeesLimit;
        this.SATISFYING_SALARY = 20_000;
    }

    public static double getSatisfyingSalary() {
        return SATISFYING_SALARY;
    }

    @Override
    public boolean canHireEmployee() {
        return employeesLimit > 0;
    }

    public boolean isSatisfied() {
        return employeesLimit <= 0 && getSalary() > SATISFYING_SALARY;
    }

    @Override
    public void hireEmployee(Employee employee) {
        employeesLimit -= 1;
        employeesList.add(employee);

    }
}

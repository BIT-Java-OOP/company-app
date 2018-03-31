package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends Employee {

    private List<Employee> employees;

    public Manager(String name, double salary) {
        super(name, salary);
        this.employees = new ArrayList();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public abstract boolean canHire(Employee employee);

    public double getSumOfEmployeesSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public int countEmployees() {
        return employees.size();
    }
}

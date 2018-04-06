package bit.javaoop.managersPackage;

import bit.javaoop.employeesPackage.AbstractEmployee;
import bit.javaoop.employeesPackage.Employee;
import com.sun.tools.javac.util.List;

public abstract class Manager extends AbstractEmployee {
    private double budget;
    private double budgetLeft = budget;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    private static List<Employee> employeesList;
    private static List<Manager> managersList;

    public abstract boolean canHireEmployee(Employee employee);

    public void hireEmployee(Employee employee, double budgetLeft, double employeesLimit) {
        employeesList.add(employee);
        budgetLeft -= setSalary();
        employeesLimit -= 1;
    }

    @Override
    public String tellName(Employee employee) {
        return employee.getName() + "Manager";
    }
}
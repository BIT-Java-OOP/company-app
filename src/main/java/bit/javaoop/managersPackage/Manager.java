package bit.javaoop.managersPackage;

import bit.javaoop.employeesPackage.AbstractEmployee;
import bit.javaoop.employeesPackage.Employee;

import java.util.ArrayList;


public abstract class Manager extends AbstractEmployee {
    protected double budget;
    protected double employeesLimit;
    private double budgetLeft = budget;

    public Manager(String name, double salary, double budget, double employeesLimit) {
        super(name, salary);
        this.budget = budget;
        this.employeesLimit = employeesLimit;
    }

    public static ArrayList<Employee> employeesList;


    public abstract boolean canHireEmployee();

    public void hireEmployee(Employee employee) {
        employeesList.add(employee);
        budgetLeft -= employee.getSalary();
        employeesLimit -= 1;
        Employee employee2 = new Employee(employee.getName(), employee.getSalary());
    }


}
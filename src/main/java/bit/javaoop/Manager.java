package bit.javaoop;

import com.sun.tools.javac.util.List;

public abstract class Manager extends AbstractEmployee{
    private Object employee;
    private double budgetLeft;
    private double employeesLimit;
    public Manager(String name, double salary) {
        super(name, salary);
    }
    private static List<Employee> employeesList;
    static List<String> managers = new List<>();
    public Manager(String name, double salary) {
        super(name, salary);
        managers.add(name);
    }
    public abstract boolean canHireEmployee(Employee employee);
    public void addEmployee (Employee employee) {
        employeesList.add(employee);
        budgetLeft -= setSalary();
        employeesLimit--;
    }
    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = addEmployee(Employee);}
}

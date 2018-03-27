package bit.javaoop;

import com.sun.tools.javac.util.List;

public abstract class Manager extends AbstractEmployee{
    private Object employee;
    private double budgetLeft;
    private double employeesLimit;
    public Manager(String name, double salary) {
        super(name, salary);
    }
    private List<Employee> employeesList;
    public Manager(String name, double salary) {
        super(name, salary);

    }
    public abstract boolean canHireEmployee(Employee employee);
    public void addemployee (Employee employee) {
        employeesList.add(employee);
        budgetLeft -= setSalary();
        employeesLimit--;
    }
    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = addemployee(Employee employee);}
}

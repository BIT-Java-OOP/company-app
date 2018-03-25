package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {

    private LinkedList<Employee> employeeList;

    public Manager(String name, double salary) {
        super(name, salary);
        employeeList = new LinkedList<Employee>();
    }

    public abstract boolean canHireEmployee(Employee employee);

    public abstract void hireEmployee(Employee employee);

    public LinkedList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(LinkedList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        StringBuilder resultBuilder = new StringBuilder(getName() + " - Manager\n");
        for (Employee employee : employeeList) {
            resultBuilder.append("\t").append(employee.toString()).append("\n");
        }
        String result = resultBuilder.toString();
        result = result.substring(0, result.length() - 1);
        return result;
    }
}

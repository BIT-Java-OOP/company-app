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
        StringBuilder string = new StringBuilder();

        string.append(getName());
        string.append(" - Manager\n");

        for (Employee employee : getEmployeeList()) {
            string.append("\t");
            string.append(employee.getName());
            string.append(" - Employee\n");
        }

        String result = string.toString();
        return result;
    }
}

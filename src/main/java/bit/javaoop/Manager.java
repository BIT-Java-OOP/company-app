package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

abstract public class Manager extends Employee {
    private List<Employee> hired_employees;

    abstract public boolean canHire();

    abstract public void hire(Employee new_employee);

    abstract public boolean isSatisfied();

    public Manager(int salary, String name) {
        super(salary, name);
        this.hired_employees = new ArrayList<Employee>();
        this.hired_employees.clear();
    }

    public List<Employee> getHired_employees() {
        return hired_employees;
    }

    public void setHired_employees(List<Employee> hired_employees) {
        this.hired_employees = hired_employees;
    }
}

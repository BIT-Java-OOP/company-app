package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {

    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public abstract boolean canHireEmployee(Employee newEmployee);

    void hireEmployeeIfPossible(Employee newEmployee) {
        if (canHireEmployee(newEmployee))
            getEmployees().add(newEmployee);
    }

    @Override
    public String toString() {
        return getName()+" - Manager";
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

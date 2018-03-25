package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {

    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public abstract boolean canHireEmployee(Employee newEmployee);

    void hireEmployee(Employee newEmployee) {
        if (canHireEmployee(newEmployee))
            getEmployees().add(newEmployee);
    }

    @Override
    public String toString() {
        StringBuilder manger = new StringBuilder("\t\t" + getName() + " - Manager\n");
        for (Employee temp : getEmployees()
                ) {
            manger.append(temp.toString());
        }
        return manger.toString();
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

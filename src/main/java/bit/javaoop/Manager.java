package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    protected List<AbstractEmployee> employees = new LinkedList<>();

    public abstract boolean canHireEmployee(AbstractEmployee employee);

    public abstract void hireEmployee(AbstractEmployee employee);

    double getBudget() {
        return employees
                .stream()
                .mapToDouble(x -> x.getSalary())
                .sum();
    }

    int getEmploueeNumber() {
        return employees.size();
    }

    public List<AbstractEmployee> getEmployees() {
        return employees;
    }
}

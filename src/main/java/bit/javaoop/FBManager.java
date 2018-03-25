package bit.javaoop;

import java.util.ArrayList;

public class FBManager extends AbstractManager {

    private double budget;

    public FBManager(String name, double salary, ArrayList<AbstractEmployee> employee_list, double budget) {
        super(name, salary, employee_list);
        this.budget = budget;
    }

    public void CanHire(AbstractEmployee employee) {
        if (budget >= employee.getSalary()) {
            budget -= employee.getSalary();
            employee_list.add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (budget < 15_000);
    }

}

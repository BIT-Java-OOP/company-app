package bit.javaoop;

import java.util.ArrayList;

public class FixedBudgetManager extends AbstractManager {

    private double budget;

    public FixedBudgetManager(String name, double salary, ArrayList<AbstractEmployee> employeesList, double budget) {
        super(name, salary, employeesList);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (budget < 15_000);
    }

    public boolean canHire(AbstractEmployee employee) {
        return (budget >= employee.getSalary());
    }

    public void hire(AbstractEmployee employee) {
        if (canHire(employee)) {
            budget -= employee.getSalary();
            employeesList.add(employee);
        }
    }
}

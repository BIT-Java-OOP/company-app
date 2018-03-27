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

    @Override
    public boolean canHire() {
        double employeesSalaries = 0;
        for (AbstractEmployee employee : employeesList) {
            employeesSalaries += employee.getSalary();
        }
        return (budget >= employeesSalaries);
    }

    @Override
    public void hire(AbstractEmployee employee) {
        if (canHire()) {
            budget -= employee.getSalary();
            employeesList.add(employee);
        }
    }
}

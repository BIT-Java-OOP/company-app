package bit.javaoop;

import java.util.ArrayList;

public class FixedBudgetManager extends AbstractManager {

    private double budget;


    public FixedBudgetManager(String name, double salary,ArrayList<AbstractEmployee> employees_list, double budget) {
        super(name, salary, employees_list);
        this.budget = budget;

    }

    public void hire(AbstractEmployee employee) {
        if (budget>=employee.getSalary())
        {
            budget -= employee.getSalary();
            employees_list.add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (budget < 15_000);
    }

}
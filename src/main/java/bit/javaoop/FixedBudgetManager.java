package bit.javaoop;

import java.util.ArrayList;

public class FixedBudgetManager extends Manager {

    private int budget;

    public FixedBudgetManager(String name, double salary, int budget, ArrayList<AbstractEmployee> listOfEmployees) {
        super(name, salary, listOfEmployees);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000 && getBudget() < 15_000);
    }


    @Override
    public boolean canHire() {
        double employeesSalaries = 0;
        for (AbstractEmployee e : listOfEmployees) {
            employeesSalaries += e.getSalary();
        }
        return (employeesSalaries < getBudget());

    }

    @Override
    public void hire(AbstractEmployee employee){
         {
             if (canHire())
            listOfEmployees.add(employee);
        }
    }
}

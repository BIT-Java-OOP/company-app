package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class FixedBudgetManager extends Manager {

    private int budget;

    public FixedBudgetManager(String name, double salary, int budget, List<AbstractEmployee> listOfEmployees) {
        super(name, salary,listOfEmployees);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000 && budget < 15_000);
    }


    public boolean hire(AbstractEmployee employee) {
        double employeesSalaries = 0;
        for (AbstractEmployee e : getListOfEmployees()) {
            employeesSalaries = employeesSalaries + e.getSalary();
        }
        if (employeesSalaries + employee.getSalary() <= budget) {
            getListOfEmployees().add(employee);
            return true;
        } else {
            return false;
        }
    }
}

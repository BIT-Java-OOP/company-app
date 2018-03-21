package bit.javaoop;

import java.util.List;

public class FixedBudgetMenager extends AbstractEmployee{

    private int budget;
    private List<AbstractEmployee> listOfEmployees;

    public FixedBudgetMenager(String name, double salary, int budget, List<AbstractEmployee> listOfEmployees) {
        super(name, salary);
        this.budget = budget;
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20_000 && budget<15_000);
    }

    public boolean isHired(Employee e) {
        double employeesSalaries = 0;
        for (AbstractEmployee employee : listOfEmployees) {
            employeesSalaries = employeesSalaries + employee.getSalary();
        }
        if (employeesSalaries + e.getSalary() <= budget) {
            listOfEmployees.add(e);
            return true;
        } else {
            return false;
        }
    }
}

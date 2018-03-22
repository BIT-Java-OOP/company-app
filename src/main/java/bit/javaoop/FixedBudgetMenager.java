package bit.javaoop;

import java.util.List;

public class FixedBudgetMenager extends Menager{

    private int budget;

    public FixedBudgetMenager(String name, double salary, int budget) {
        super(name, salary);
        this.budget = budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20_000 && budget<15_000);
    }


    public boolean hire(AbstractEmployee employee) {
        double employeesSalaries = 0;
        for (AbstractEmployee oneOfEmployees : getListOfEmployees()) {
            employeesSalaries = employeesSalaries + oneOfEmployees.getSalary();
        }
        if (employeesSalaries + employee.getSalary() <= budget) {
            getListOfEmployees().add(employee);
            return true;
        } else {
            return false;
        }
    }
}

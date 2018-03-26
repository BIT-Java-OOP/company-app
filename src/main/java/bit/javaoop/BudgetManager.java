package bit.javaoop;

import java.math.BigDecimal;

public class BudgetManager extends Manager {
    private double budget;

    public BudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;

    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20000) && (budget < 15000);
    }

    @Override
    public boolean canHire(Employee employee) {
        return (budget - employee.getSalary()) > 0;
    }

    @Override
    public void hireNewEmployee(Employee employee) {
        if (canHire(employee)) {
            getEmployees().add(employee);
            budget = budget - employee.getSalary();
        }
    }
}

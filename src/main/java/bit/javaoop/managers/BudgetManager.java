package bit.javaoop.managers;

import bit.javaoop.employees.Employee;

public class BudgetManager extends AbstractManager {
    private static double SATISFYING_SALARY;
    protected double budget;
    private double budgetLeft;

    public BudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget = budget;
        this.budgetLeft = budget;
        this.SATISFYING_SALARY = 20_000;
    }

    public static double getSatisfyingSalary() {
        return SATISFYING_SALARY;
    }


    @Override
    public boolean canHireEmployee() {
        return budgetLeft >= 0;
    }

    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY && budgetLeft < 15_000;
    }

    @Override
    public void hireEmployee(Employee employee) {
        budgetLeft -= employee.getSalary();
        employeesList.add(employee);
    }
}


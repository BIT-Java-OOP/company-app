package bit.javaoop.company;

import bit.javaoop.employmentpolicy.EmploymentPolicy;
import bit.javaoop.salarycalculator.SalaryCalculator;

public class FixedBudgetManager extends AbstractManager {

    private final static int SATISFYING_SALARY = 20_000;
    private final static int MIN_SATISFYING_BUDGET = 15_000;

    public FixedBudgetManager(String name, double salary, EmploymentPolicy employmentPolicy, SalaryCalculator salaryCalculator, double fixedBudget) {
        super(name, salary, employmentPolicy, salaryCalculator);
        this.fixedBudget = fixedBudget;
    }

    private double fixedBudget;

    private double getEmployeesSalary() {
        double sumOfEmployeesSalary = 0;
        for (AbstractEmployee employee : getListOfEmployees())
            sumOfEmployeesSalary += employee.getSalary();
        return sumOfEmployeesSalary;
    }

    @Override
    public boolean canHireNewEmployee() {
        return (getActualBudget()) >= 0;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > SATISFYING_SALARY && getActualBudget() < MIN_SATISFYING_BUDGET);
    }

    private double getActualBudget() {
        return fixedBudget - getEmployeesSalary();
    }
}

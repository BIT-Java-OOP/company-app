package bit.javaoop.company.manager;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.employment.EmploymentPolicy;

import java.util.List;

public class FixedBudgetManager extends AbstractManager {

    private static final int SATISFYING_SALARY = 20_000;
    private static final int MAX_SATISFIED_BUDGET = 15_000;

    private double budget;

    public FixedBudgetManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy, List<AbstractEmployee> listOfEmployees, int initialBudget) {
        super(name, salary, salaryCalculator, employmentPolicy, listOfEmployees);
        this.budget = initialBudget;
    }

    public FixedBudgetManager(String name, double salary, int initialBudget) {
        super(name, salary);
        this.budget = initialBudget;
    }


    @Override
    public boolean isSatisfied() {
        return (getSalary() > SATISFYING_SALARY && budget < MAX_SATISFIED_BUDGET);
    }

    public boolean hireIfPossible(AbstractEmployee employee) {
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

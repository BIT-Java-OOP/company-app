package bit.javaoop.company;

import bit.javaoop.employmentpolicy.EmploymentPolicy;
import bit.javaoop.salarycalculator.SalaryCalculator;

public class FixedEmployeeNumberManager extends AbstractManager {
    private final static int SATISFYING_SALARY = 20_000;
    private int employeesMaxCount;

    public FixedEmployeeNumberManager(String name, double salary, EmploymentPolicy employmentPolicy, SalaryCalculator salaryCalculator, int employeesMaxCount) {
        super(name, salary, employmentPolicy, salaryCalculator);
        this.employeesMaxCount = employeesMaxCount;
    }

    @Override
    public boolean canHireNewEmployee() {
        return getListOfEmployees().size() < employeesMaxCount;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY && getListOfEmployees().size() == employeesMaxCount;
    }
}

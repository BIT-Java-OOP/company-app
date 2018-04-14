package bit.javaoop.company.manager;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.employment.EmploymentPolicy;

import java.util.List;

public class FixedEmployeeNumberManager extends AbstractManager {

    private static final int SATISFYING_SALARY = 20_000;

    private int spotsLeft;

    public FixedEmployeeNumberManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy, List<AbstractEmployee> listOfEmployees, int initialLimitOfEmployees) {
        super(name, salary, salaryCalculator, employmentPolicy, listOfEmployees);
        this.spotsLeft = initialLimitOfEmployees;
    }

    public FixedEmployeeNumberManager(String name, double salary, int initialLimitOfEmployees) {
        super(name, salary);
        this.spotsLeft = initialLimitOfEmployees;
    }


    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY && spotsLeft == 0;
    }

    @Override
    public boolean hireIfPossible(AbstractEmployee employee) {
        if (spotsLeft > 0) {
            getListOfEmployees().add(employee);
            spotsLeft--;
            return true;
        }
        return false;
    }
}

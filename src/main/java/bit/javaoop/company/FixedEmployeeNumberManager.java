package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.policy.EmploymentPolicy;

public class FixedEmployeeNumberManager extends AbstractManager {

    private double satisfyingSalary = 20_000;
    private int spotsToHire;

    public FixedEmployeeNumberManager(String name, double salary, int spotsToHire, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        super(name, salary, salaryCalculator, employmentPolicy);
        this.spotsToHire = spotsToHire;
    }


    @Override
    public boolean isSatisfied() {
        return this.getSalary() > satisfyingSalary && this.spotsToHire == 0;
    }

    @Override
    public boolean checkHirePossibility() {
        return this.spotsToHire > 0;
    }

    @Override
    public void hireEmployee(AbstractEmployee newEmployee) {
        super.hireEmployee(newEmployee);
        this.spotsToHire--;
    }

}
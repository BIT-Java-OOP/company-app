package bit.javaoop.salary;

import bit.javaoop.salary.SalaryCalculator;

public class EmploymentContractCalculator implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary*0.8;
    }
}

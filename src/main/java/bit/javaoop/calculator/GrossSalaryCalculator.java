package bit.javaoop.calculator;

import bit.javaoop.employment.EmploymentPolicy;

public class GrossSalaryCalculator implements SalaryCalculator {

    @Override
    public double getActualSalary(double salary) {
        return salary;
    }
}

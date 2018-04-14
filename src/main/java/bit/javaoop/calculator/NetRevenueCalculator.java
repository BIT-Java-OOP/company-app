package bit.javaoop.calculator;

import bit.javaoop.employment.EmploymentPolicy;

public class NetRevenueCalculator implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary*0.7;
    }
}

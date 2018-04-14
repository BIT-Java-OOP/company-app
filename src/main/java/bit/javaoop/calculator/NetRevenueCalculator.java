package bit.javaoop.calculator;

public class NetRevenueCalculator implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary * 0.7;
    }
}

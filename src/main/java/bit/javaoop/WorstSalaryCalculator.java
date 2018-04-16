package bit.javaoop;

public class WorstSalaryCalculator implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary*(0.5);
    }
}

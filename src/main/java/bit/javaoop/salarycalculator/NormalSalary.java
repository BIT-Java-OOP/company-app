package bit.javaoop.salarycalculator;

public class NormalSalary implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary;
    }
}

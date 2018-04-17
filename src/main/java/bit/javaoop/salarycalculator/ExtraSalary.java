package bit.javaoop.salarycalculator;

public class ExtraSalary implements SalaryCalculator {
    private final static double SALARY_MULTIPLIER = 1.5;

    @Override
    public double getActualSalary(double salary) {
        return salary * SALARY_MULTIPLIER;
    }
}

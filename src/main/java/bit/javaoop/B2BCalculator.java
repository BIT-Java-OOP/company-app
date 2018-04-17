package bit.javaoop;

public class B2BCalculator implements SalaryCalculator {

    @Override
    public double getActualSalary(double salary) {
        return salary*0.6;
    }
}

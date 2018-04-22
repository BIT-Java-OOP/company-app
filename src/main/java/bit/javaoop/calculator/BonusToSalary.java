package bit.javaoop.calculator;

public class BonusToSalary implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary){
        return salary*0.25;
    }
}
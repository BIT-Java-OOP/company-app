package bit.javaoop.calculator;

public class AnnualSalary implements SalaryCalculator{
    @Override
    public double getActualSalary(double salary){
        return (salary*12)*8.5;
    }
}
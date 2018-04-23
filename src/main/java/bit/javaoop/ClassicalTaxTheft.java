package bit.javaoop;

public class ClassicalTaxTheft implements SalaryCalculator{

    //Regular salary calculator with no special benefits, just huge tax

    @Override
    public double getActualSalary(double salary) {
        return salary*0.66;
    }
}

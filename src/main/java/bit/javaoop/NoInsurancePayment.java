package bit.javaoop;

public class NoInsurancePayment implements SalaryCalculator{

    //In this case taxation is lower but when you get sick you die


    @Override
    public double getActualSalary(double salary) {
        return salary*0.85;
    }
}

package bit.javaoop;

public class HolidayBonusSalary implements SalaryCalculator{


    //Payment meant for higher company officials for whom every day is holiday

    @Override
    public double getActualSalary(double salary) {
        return salary*1.25;
    }
}

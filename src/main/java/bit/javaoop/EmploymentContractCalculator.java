package bit.javaoop;

public class EmploymentContractCalculator implements SalaryCalculator {
    @Override
    public double getActualSalary(double salary) {
        return salary*0.8;
    }
}

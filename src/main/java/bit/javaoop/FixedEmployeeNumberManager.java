package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    public static final int SATYSFYING_SALARY = 20_000;
    private int limit;
    private int count;

    public FixedEmployeeNumberManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy, int limit) {
        super(name, salary, salaryCalculator, employmentPolicy);
        this.limit = limit;
        this.count = 0;
    }

    @Override
    public boolean isSatisfied() {
        return getActualSalary(getSalary()) > SATYSFYING_SALARY && count == limit;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return count < limit;
    }
    public void hire(AbstractEmployee employee) {
        if(canHire(employee)) {
            getEmployeeList().add(employee);
            count++;
        }
        else System.out.println("We can't hire an employee. \n");
    }


    @Override
    public double getActualSalary(double salary) {
        return getSalaryCalculator().getActualSalary(salary);
    }
}

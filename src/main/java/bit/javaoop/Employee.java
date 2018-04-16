package bit.javaoop;

public class Employee extends AbstractEmployee {

    public static final int SATYSFYING_SALARY = 10_000;

    public Employee(String name, double salary,SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy){ //konstruktor
        super(name, salary,salaryCalculator, employmentPolicy);
    }
    public boolean isSatisfied(){
        return getActualSalary(getSalary()) > SATYSFYING_SALARY; //mozna pisac podkreslniki
    }


    @Override
    public double getActualSalary(double salary) {
        return getSalaryCalculator().getActualSalary(salary);
    }
}

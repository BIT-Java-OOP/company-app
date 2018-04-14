package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.employment.EmploymentPolicy;

public class Employee extends AbstractEmployee {

    private static final int SATISFYING_SALARY = 10_000;


    public Employee(String name, double salary, SalaryCalculator salaryCalculator,EmploymentPolicy employmentPolicy) {
        super(name,salary, salaryCalculator,employmentPolicy );
    }


    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY;
    }



}

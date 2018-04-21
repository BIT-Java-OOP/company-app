package bit.javaoop;

public abstract class AbstractEmployee implements SalaryCalculator {
    private String name;
    private double salary;
    private SalaryCalculator salaryCalculator;
    private EmploymentPolicy employmentPolicy;

    public AbstractEmployee(String name, double salary,SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy){
        this.name = name;
        this.salary = salary;
        this.salaryCalculator = salaryCalculator;
        this.employmentPolicy = employmentPolicy;
    }


    public abstract boolean isSatisfied();

    public String getName(){
        return name;
    }
    public double getSalary(){return salary;}
    public SalaryCalculator getSalaryCalculator(){
        return salaryCalculator;
    }

    @Override
    public String toString(){
        return getName();
    }
}

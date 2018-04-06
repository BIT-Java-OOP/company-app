package bit.javaoop;


public abstract class AbstractEmployee {
    private String name;
    private Float salary;
    private String employmentPolicy;
    private SalaryCalculator salaryCalculator;


    public AbstractEmployee(String name, Float salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public AbstractEmployee(String name)
    {
        this.name=name;
    }

    public String getEmploymentPolicy() {
        return employmentPolicy;
    }

    public void setEmploymentPolicy(String employmentPolicy) {
        this.employmentPolicy = employmentPolicy;
    }

    public Float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    abstract boolean isSatisfied();


}

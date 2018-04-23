package bit.javaoop;

public abstract class AbstractEmployee {
    private final String name;
    private double salary;
    private SalaryCalculator cal;

    public AbstractEmployee(String name, double salary, SalaryCalculator cal) {
        this.name = name;
        this.salary = salary;
        this.cal = cal;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return cal.getActualSalary(salary);
    }

    @Override
    public String toString() {
        return name + " - Employee";
    }
}

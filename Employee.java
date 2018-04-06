package bit.javaoop;

public class Employee extends AbstractEmployee implements Inferior{
    public Employee(String name, Float salary)
    {
        super(name, salary);
    }


    public boolean isSatisfied() {
        Float satisfiedSalary = 5_000f;
        return getSalary()>satisfiedSalary;
    }


}

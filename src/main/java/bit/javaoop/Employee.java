package bit.javaoop;

public class Employee extends AbstractEmployee{
    private final String position = "employee";
    public Employee(String name, Float salary)
    {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        return true;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void addEmployee(AbstractEmployee employee) {
        return;

    }
}

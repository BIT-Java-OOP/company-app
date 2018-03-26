package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    private final String position ="manager";
    Integer limitEmployees = 10;
    public FixedEmployeeNumberManager(String name, Float salary)
    {
        super(name,salary);
        getEmployeeList().add(this);
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public boolean canHire() {
        return limitEmployees > getAmountOfEmployees();
    }

    public void addEmployee(AbstractEmployee employee)
    {
        if(canHire() && !getEmployeeList().contains(employee))
        {
            super.addEmployee(employee);
        }
        else
        {
            System.out.printf("Cannot hire a new employee");
        }
    }

    public boolean isSatisfied()
    {
        return getSalary()>20_000f && limitEmployees-getAmountOfEmployees()>0;
    }

}

package bit.javaoop;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    private final Float budget = 100_000f;
    private List <AbstractEmployee> EmployeeList = getEmployeeList();


    public AbstractManager(String name, Float salary)
    {
       super(name,salary);
    }


    public abstract boolean canHire();

    public boolean isSatisfied()
    {
        return getSalary()>10_000.0f;
    }


    public void addEmployee(AbstractEmployee employee)
    {
        EmployeeList.add(employee);
    }


    public Float getSalaries() {
        Float salaries=0f;
        for(AbstractEmployee e: EmployeeList)
        {
            if(e.getPosition().equals("employee")) salaries+=e.getSalary();
        }
        return salaries;
    }


    public Integer getAmountOfEmployees()
    {
        Integer count=0;
        for(AbstractEmployee e: EmployeeList)
        {
            if(e.getPosition().equals("employee")) count++;
        }
        return count;
    }

    public Float getBudget() {
        return budget;
    }
}

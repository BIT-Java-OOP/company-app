package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {
    private final String position ="manager";

    @Override
    public String getPosition() {
        return position;
    }

    public FixedBudgetManager(String name, Float salary)
    {
        super(name,salary);

        getEmployeeList().add(this);
    }

    @Override
    public boolean canHire() {
        return getBudget()>getSalaries();
    }

    @Override
    public void addEmployee(AbstractEmployee employee) {
        if(canHire() && !getEmployeeList().contains(employee))
        {
            super.addEmployee(employee);
        }
        else
        {
            System.out.println("Cannot hire a new employee");
        }
    }

    public boolean isSatisfied()
    {
        Float budget = getBudget();
        Float salaries = getSalaries();
        return budget-salaries>15_000 && getSalary() > 20_000;
    }
}

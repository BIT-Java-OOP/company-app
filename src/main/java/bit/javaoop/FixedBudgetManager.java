package bit.javaoop;

public class FixedBudgetManager extends AbstractManager{

    public static final int SATISFYING_SALARY = 20_000;
    public static final int SATISFYING_BUDGET = 15_000;
    private int budget;

    public FixedBudgetManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy, int budget) {
        super(name, salary, salaryCalculator, employmentPolicy);
        this.budget = budget;
    }

    public boolean isSatisfied(){
        return getActualSalary(getSalary()) > SATISFYING_SALARY && getBudget() < SATISFYING_BUDGET; // ctr + alt + c
    }
    public boolean canHire(AbstractEmployee employee){
        int result = 0;
        for(AbstractEmployee anEmployee : getEmployeeList())  {
            result += anEmployee.getSalary();
        }
        return result < getBudget();
    }
    public void hire(AbstractEmployee employee) {
        if(canHire(employee)) {
            getEmployeeList().add(employee);
            decreaseBudget(employee.getSalary());
        }
        else System.out.println("We can't hire an employee. \n");
    }
    public void decreaseBudget(double money){
        budget -= money;
    }

    public int getBudget() {
        return budget;
    }


    @Override
    public double getActualSalary(double salary) {
        return getSalaryCalculator().getActualSalary(salary);
    }
}

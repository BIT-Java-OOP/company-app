package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {

    private int budget =100000;

    public FixedBudgetManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean canHire(Employee e) {
        return (getTotalEmployeesSalary()+e.getSalary())< budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20000 && (budget - getTotalEmployeesSalary())<15000);
    }

    private int getTotalEmployeesSalary(){
        int sum=0;
        for(Employee e : Hired) {
            sum+=e.getSalary();
        }
        return sum;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

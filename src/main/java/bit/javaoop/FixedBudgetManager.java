package bit.javaoop;

public class FixedBudgetManager extends Manager {

    private int Budget =100000;

    public FixedBudgetManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean canHire(Employee e) {
        return (getTotalEmpSalary()+e.getSalary())< Budget;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20000 && (Budget -getTotalEmpSalary())<15000);
    }

    private int getTotalEmpSalary(){
        int sum=0;
        for(Employee e : Hired) {
            sum+=e.getSalary();
        }
        return sum;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }
}

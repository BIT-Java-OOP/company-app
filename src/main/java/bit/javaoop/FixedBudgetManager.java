package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {
    protected double budget;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        double sum = 0;
        for(AbstractEmployee e:subordinates) sum+=e.getSalary();
        if(budget>=sum) this.budget = budget;
    }

    public FixedBudgetManager(String name, double salary,double budget) {
        super(name, salary);
        this.budget = budget;
    }

    @Override
    public boolean canHire(AbstractEmployee e) {
        double sum = 0;
        for(AbstractEmployee e1:subordinates) sum+=e1.getSalary();
        return (sum+e.getSalary()<budget);
    }

    @Override
    public void hire(AbstractEmployee e) {
        if(canHire(e)) subordinates.add(e);
    }

    @Override
    public boolean isSatisfied() {
        double spareMoney = budget;
        for(AbstractEmployee e:subordinates) spareMoney -= e.getSalary();
        return (salary>20000 && spareMoney<15000);
    }
}

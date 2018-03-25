package bit.javaoop;

public class FixedBudgetManager extends AbstractManager{

    private int budget;
    public FixedBudgetManager(String name, double salary, int budget) {
        super(name, salary);
        this.budget = budget;
    }
    public boolean isSatisfied(){
        return getSalary() > 20_000 && getBudget() < 15_000;
    }
    public boolean CanHire(AbstractEmployee employee){
        int result = 0;
        for(int i = 0; i < getEmployeeList().size(); i++){
            result += getEmployeeList().get(i).getSalary();
        }
        if(result > getBudget()) return false;
        else return true;
    }
    public void hire(AbstractEmployee employee) {
        if(CanHire(employee)) {
            getEmployeeList().add(employee);
            rmBudget(employee.getSalary());
        }
        else System.out.println("We can't hire an employee. \n");
    }
    public void rmBudget(double money){
        budget -= money;
    }

    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
}

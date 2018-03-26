package bit.javaoop;

public class FixedBudgetManager extends Manager {

    private final int limit;

    public boolean canBeHired(Employee employee){
        return super.canBeHired() && (getSumOfAllEmployeesSalaries()+employee.getSalary()) < limit;
    }

    public int getSumOfAllEmployeesSalaries(){
        int sum = 0;
        for(int i = 0; i < getCounter(); i++){
            sum += getTab()[i].getSalary();
        }
        return sum;
    }
    @Override
    public boolean isSatisfied(){
        return getSalary() > 20000 && (limit - getSumOfAllEmployeesSalaries()) < 15000; // to troche nielogiczne, nie powinno byc > 15000?
    }

    @Override
    public void addEmployee(Employee employee){
        if(canBeHired(employee)){
            getTab()[getCounter()] = employee;
            incrementCounter();
        }
    }
    public FixedBudgetManager(String name, double salary, int counter, int limit) {
        super(name, salary, counter);
        this.limit = limit;
    }
}

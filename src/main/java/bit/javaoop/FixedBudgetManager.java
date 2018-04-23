package bit.javaoop;

public class FixedBudgetManager extends AbstractManager {
    private double budget;
    private double employeesSalary;


    public FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary,new ClassicalTaxTheft());
        this.budget = budget;
        this.employeesSalary = 0;
    }


    @Override
    public boolean isSatisfied(){
        return (getSalary()>20_000 && (budget-employeesSalary)<15_000);
    }


    @Override
    public boolean canHire(double salary){
        return ((budget-employeesSalary)>=salary);
    }

    @Override
    public void hire(String name, double salary) { //yet to be written
        if(this.canHire(salary)){
            employees.add(new Employee(name,salary));
            employeesSalary+=salary;
            System.out.println(name+" was successfully hired!!");
        } else {
            System.out.println(name+" cannot be hired due to insufficient budget.");
        }
    }
}

package bit.javaoop;

public class FixedBudgetManager extends Manager {
    private final int capacity =5;
    private final double limit;
    private Employee tab[];

    public FixedBudgetManager(String name, double salary, int counter,int limit) {
        super(name, salary, counter);
        this.limit=limit;
        tab=new Employee[capacity];
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public Employee[] getTab() {
        return tab;
    }

    @Override
    public void setTab(Employee[] tab) {
        this.tab = tab;
    }

    public double getSumOfHired(){
        int suma=0;
        for (int i=0; i<getCounter();i++)
            suma+= getTab()[i].getSalary();
        return suma;
    }

    public boolean fbmcanHire(double new_worker_salary){
        double suma=getSumOfHired()+new_worker_salary;
        return ((suma <limit)&&getCounter()<getCapacity());
    }
    public void addEmployee(Employee employee){
        if (fbmcanHire(employee.getSalary())) {
            tab[getCounter()]=employee;
            increment_counter();
        }
    }
    @Override
    public boolean isSatisfied(){
        return (getSalary()>20000 && (limit - getSumOfHired())<15000);
    }


}

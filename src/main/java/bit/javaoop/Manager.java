package bit.javaoop;

public class Manager extends Employee {

    private final int N = 5;
    private Employee tab[] = new Employee[N];
    private int counter = 0;

    public Manager(String name, double salary,int counter){
        super(name,salary);
        this.counter = counter;
    }

    public int getN() {
        return N;
    }

    public Employee[] getTab() {
        return tab;
    }

    public void setTab(Employee[] tab) {
        this.tab = tab;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter(){
        counter++;
    }
    public void addEmployee(Employee employee){
        if(canBeHired()){
            tab[getCounter()] = employee;
            incrementCounter();
        }
    }

    public boolean canBeHired(){
        return getCounter() < tab.length;
    }
}

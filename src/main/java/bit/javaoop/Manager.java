package bit.javaoop;

public class Manager extends Employee{
    private Employee tab[];
    private int counter = 0;

    public Manager(String name, double salary, int counter) {
        super(name, salary);
        this.counter = counter;
        tab=new Employee[5];
    }

    public int getCapacity() {
        return tab.length;
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

    public void increment_counter(){
        counter++;
    }

    public void addEmployee(Employee employee){
        if (canHire()) {
            tab[getCounter()]=employee;
            increment_counter();

        }
    }


    public boolean canHire(){
       return getCounter()<getCapacity();
    }
    @Override
    public String toString(){
        return getName();
    }
}

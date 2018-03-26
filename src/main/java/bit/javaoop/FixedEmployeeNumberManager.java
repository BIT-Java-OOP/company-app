package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {

    public FixedEmployeeNumberManager(String name, double salary, int counter, int employeers) {
        super(name, salary, counter);
        Employee tab[] = new Employee[employeers];
        setTab(tab);
    }
    @Override
    public boolean isSatisfied(){
        return getSalary() > 20000 && (getCounter() == getTab().length);
    }

}

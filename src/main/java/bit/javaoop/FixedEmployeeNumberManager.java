package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
  //  ArrayList<Employee> employeersList = new ArrayList<Employee>();

    public FixedEmployeeNumberManager(String name, double salary, int counter, int employeers) {
        super(name, salary, counter);
        Employee tab[] = new Employee[employeers];
        setTab(tab);
    //    employeersList.add();
    }
    @Override
    public boolean isSatisfied(){
        return ((getSalary()>20000)&&(getCounter()==getTab().length));
    }



}

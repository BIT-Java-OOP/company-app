package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    int maxemployees;
    public FixedEmployeeNumberManager(String name, double salary, int maxemployees) {
        super(name, salary);
        this.maxemployees=maxemployees;
    }

    @Override
    public boolean canhire(AbstractEmployee employee) {
        return (getEmployyesNumer()<maxemployees);
    }

    @Override
    public void hire(AbstractEmployee employee) {
    if(canhire(employee))  employees.add(employee);
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>=20000 && maxemployees==getEmployyesNumer());
    }
}

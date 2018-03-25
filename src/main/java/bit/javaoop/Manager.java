package bit.javaoop;

import java.util.ArrayList;

public abstract class Manager extends AbstractEmployee {

    protected ArrayList<Employee> Hired = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public abstract boolean canHire(Employee e);

    public void hire(Employee e){
        Hired.add(e);
    }
}

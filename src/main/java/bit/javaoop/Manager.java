package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {

    private List<Employee> myEmployees;

    public Manager(String name, double salary) {
        super(name, salary);
        this.myEmployees = new ArrayList<>();
    }

    public int howManyEmployees() {
        return myEmployees.size();
    }

    public Employee getEmployee(int i) {
        return myEmployees.get(i);
    }

    public void hireEmployee(Employee newCandidate) {
        myEmployees.add(newCandidate);
    }

    public double myEmployeesSalaries() {
        double sum = 0;
        int count = myEmployees.size();
        for (int i = 0; i < count; i++) {
            sum += myEmployees.get(i).getSalary();
        }
        return sum;
    }

    public abstract boolean canHire(Employee newCandidate);

}

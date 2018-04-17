package bit.javaoop.workers;

import bit.javaoop.salary.SalaryCalculator;
import bit.javaoop.workers.AbstractEmployee;
import bit.javaoop.workers.Employee;

import java.util.ArrayList;

public abstract class AbstractManager extends AbstractEmployee {

    ArrayList<Employee> Hired = new ArrayList<>();

    public AbstractManager(String name, double salary, SalaryCalculator salaryCalculator) {
        super(name, salary, salaryCalculator);
    }

    @Override
    public boolean isSatisfied() {
        return false;
    }

    public abstract boolean canHire(Employee e);

    public void hire(Employee e){
        Hired.add(e);
    }
}

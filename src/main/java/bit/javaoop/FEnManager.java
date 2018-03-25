package bit.javaoop;

import java.util.ArrayList;

public class FEnManager extends AbstractManager {

    private int limit;

    public FEnManager(String name, double salary, ArrayList<AbstractEmployee> employee_list, int limit) {
        super(name, salary, employee_list);
        this.limit = limit;
    }

    public void CanHire(AbstractEmployee employee) {
        if (limit > employee_list.size()) {
            employee_list.add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (limit == employee_list.size());
    }
}

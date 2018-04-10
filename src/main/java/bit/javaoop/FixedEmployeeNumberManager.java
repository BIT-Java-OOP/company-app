package bit.javaoop;

import java.util.ArrayList;

public class FixedEmployeeNumberManager extends AbstractManager {

    private int hiringAbility;


    public FixedEmployeeNumberManager(String name, double salary, ArrayList<AbstractEmployee> employeesList, int hiringAbility) {
        super(name, salary, employeesList);
        this.hiringAbility = hiringAbility;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (hiringAbility == employeesList.size());
    }

    @Override
    public boolean canHire() {
        return (hiringAbility > employeesList.size());
    }

    @Override
    public void hire(AbstractEmployee employee) {
        if (canHire()) {
            employeesList.add(employee);
        }
    }
}
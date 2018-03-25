package bit.javaoop;

import java.util.ArrayList;

public class FixedEmployeeNumberManager extends AbstractManager {

    private int hiringAbility;

    public FixedEmployeeNumberManager(String name, double salary, ArrayList<AbstractEmployee> employees_list, int hiringAbility) {
        super(name, salary, employees_list);
        this.hiringAbility = hiringAbility;

    }

    public void hire(AbstractEmployee employee) {
        if (hiringAbility > employees_list.size())
        {
            employees_list.add(employee);
        }
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (hiringAbility == employees_list.size());
    }


}
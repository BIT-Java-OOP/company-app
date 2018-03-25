package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {

    private int limit;

    public FixedEmployeeNumberManager(String name, double salary, int limit) {
        super(name, salary);
        this.limit = limit;
    }

    public FixedEmployeeNumberManager(String name, double salary) {
        this(name, salary, 1000);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20000 && getLimit() - getEmployees().size() == 0;
    }

    @Override
    public boolean canHireEmployee(Employee newEmployee) {
        return getLimit() - getEmployees().size() - 1 >= 0;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

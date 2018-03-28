package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {

    public static final int MIN_OK_SALARY = 20000;
    public static final int OK_EMPLOYEE_LIMIT = 0;
    public static final int LIMIT_INIT = 1000;
    private int limit;

    public FixedEmployeeNumberManager(String name, double salary, int limit) {
        super(name, salary);
        this.limit = limit;
    }

    public FixedEmployeeNumberManager(String name, double salary) {
        this(name, salary, LIMIT_INIT);
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > MIN_OK_SALARY) && ((getLimit() - getEmployees().size()) == OK_EMPLOYEE_LIMIT);
    }

    @Override
    public boolean canHireEmployee(Employee newEmployee) {
        return getLimit() - getEmployees().size() > 0;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

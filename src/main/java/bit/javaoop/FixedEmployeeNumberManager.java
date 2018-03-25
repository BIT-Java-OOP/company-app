package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {
    private int limit;
    private int count;
    public FixedEmployeeNumberManager(String name, double salary, int limit) {
        super(name, salary);
        this.count = 0;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && count == limit;
    }

    @Override
    public boolean CanHire(AbstractEmployee employee) {
        return count < limit;
    }
    public void hire(AbstractEmployee employee) {
        if(CanHire(employee)) {
            getEmployeeList().add(employee);
            count++;
        }
        else System.out.println("We can't hire an employee. \n");
    }

}

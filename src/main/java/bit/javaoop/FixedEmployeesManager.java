package bit.javaoop;

public class FixedEmployeesManager extends AbstractManager {
    private int limit;
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(subordinates.size()<=limit) this.limit = limit;
    }


    public FixedEmployeesManager(String name, double salary, int limit) {
        super(name, salary);
        this.limit = limit;
    }

    @Override
    public boolean canHire(AbstractEmployee e) {
        return (subordinates.size()<limit);
    }

    @Override
    public void hire(AbstractEmployee e) {
        if(canHire(e)) subordinates.add(e);
    }

    @Override
    public boolean isSatisfied() {
        return (salary>20000 && limit == subordinates.size());
    }
}

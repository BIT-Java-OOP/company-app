package bit.javaoop;

public class FixedEmploeeNumberManager extends Manager {

    private int EmploeeLimit = 15;

    public FixedEmploeeNumberManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean canHire() {
        return false;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20000 && EmploeeLimit ==0);
    }

    @Override
    public void hire(Employee e) {
        super.hire(e);
        EmploeeLimit--;
    }
}

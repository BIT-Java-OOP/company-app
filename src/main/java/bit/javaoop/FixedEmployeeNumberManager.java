package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int freeSpots;

    public FixedEmployeeNumberManager(String name, double salary, int freeSpots) {
        super(name, salary);
        this.freeSpots = freeSpots;
    }

    @Override
    public boolean isSatisfied() {
        return this.getSalary() > 20_000 && this.freeSpots == 0;
    }

    @Override
    public boolean canHire(Employee newCandidate) {
        return this.freeSpots > 0;
    }

    @Override
    public void hireEmployee(Employee newCandidate) {
        super.hireEmployee(newCandidate);
        this.freeSpots--;
    }
}

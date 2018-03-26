package bit.javaoop;

public class EmployeeNumberManager extends Manager {
    private Integer numberOfFreeSpots;

    public EmployeeNumberManager(String name, double salary, Integer numberOfFreeSpots) {
        super(name, salary);
        this.numberOfFreeSpots = numberOfFreeSpots;
    }


    @Override
    public boolean isSatisfied() {
        return (numberOfFreeSpots == 0) && (getSalary() > 20_000);
    }

    @Override
    public boolean canHire(Employee employee) {
        return numberOfFreeSpots > 0;
    }

    @Override
    public void hireNewEmployee(Employee employee) {
        if (canHire(employee)) {
            numberOfFreeSpots--;
            getEmployees().add(employee);
        }
    }
}

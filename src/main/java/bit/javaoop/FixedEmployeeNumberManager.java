package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    int limitofEmployees;

    FixedEmployeeNumberManager(String name, double salary, int limit) {
        super(name, salary);
        this.limitofEmployees=limit;
    }

    @Override
    public boolean CanHire(Employee employee) {
        return listofEmployees.size()<limitofEmployees;
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary()>20_000 && limitofEmployees==listofEmployees.size());
    }

}

package bit.javaoop;

public class FixedEmployeeManager extends Manager {
    private int maxEmployees;

    public FixedEmployeeManager(String name, double salary, int maxEmployees) {
        super(name, salary);
        this.maxEmployees = maxEmployees;
    }

    @Override
    public boolean canHireEmployee(AbstractEmployee employee) {
        return getEmploueeNumber() < maxEmployees;
    }

    @Override
    public void hireEmployee(AbstractEmployee employee) {
        if (canHireEmployee(employee)) employees.add(employee);
    }

    @Override
    public boolean isSatisfied() {
        boolean salarySatisfaction = getSalary() > 20000;
        boolean employmentSatisfaction = getEmploueeNumber() == maxEmployees;
        return salarySatisfaction && employmentSatisfaction;
    }
}

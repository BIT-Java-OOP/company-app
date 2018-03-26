package bit.javaoop;

public class EmployeeNumberManager extends AbstractManager {

    private int employeeSpots;
    private final int no_more_free_spots=0;

    public EmployeeNumberManager(String name, double salary, Company company, int employeeSpots) {
        super(name, salary, company);
        this.employeeSpots = employeeSpots;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return (employeeSpots > 0) && (!this.getEmployeesList().contains(employee));
    }

    @Override
    public void hireNewEmployee(AbstractEmployee employee, Company company) {
        if (canHire(employee)) {
            --employeeSpots;
            insertToEmployeesList(employee);
            if (company.checkIfEmployeeWorkInThisCompany(employee))
                company.deleteFromEmployeesList(employee);
            System.out.println("Manager "+ getName() +" has hired "+employee.getName()+".");
        } else
            System.out.println("Manager "+ getName() +" have no more free spots or have already hired this employee.");
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > satisfying_salary) && (employeeSpots == no_more_free_spots);
    }
}

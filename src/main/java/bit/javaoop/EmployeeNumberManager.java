package bit.javaoop;

public class EmployeeNumberManager extends AbstractManager {

    private int employeeCount;

    public EmployeeNumberManager(String name, double salary, Company company, int employeeCount) {
        super(name, salary, company);
        this.employeeCount = employeeCount;
    }

    @Override
    public boolean canHire(AbstractEmployee employ) {
        return (employeeCount > 0) && (!this.getEmployeesList().contains(employ));
    }

    @Override
    public void hireNewEmployee(AbstractEmployee employ, Company company) {
        if (canHire(employ)) {
            --employeeCount;
            insertToEmployeesList(employ);
            if (company.checkIfEmployeeWorkInThisCompany(employ))
                company.deleteFromEmployeesList(employ);
            System.out.println("Manager "+ getName() +" has hired "+employ.getName()+".");
        } else
            System.out.println("Manager "+ getName() +" have no more free spots or have already hired this employee.");
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (employeeCount == 0);
    }
}

package bit.javaoop;

public class BudgetManager extends AbstractManager {

    private double budget;

    public BudgetManager(String name, double salary, double budget, Company company) {
        super(name, salary, company);
        this.budget = budget;
    }

    @Override
    public boolean canHire(AbstractEmployee employ) {
        return (budget > employ.getSalary()) && (!this.getEmployeesList().contains(employ));
    }

    @Override
    public void hireNewEmployee(AbstractEmployee employ, Company company) {
        if (canHire(employ)) {
            budget -= employ.getSalary();
            insertToEmployeesList(employ);
            if (company.checkIfEmployeeWorkInThisCompany(employ))
                company.deleteFromEmployeesList(employ);
            System.out.println("Manager "+ getName() +" has hired "+employ.getName()+".");
        } else
            System.out.println("Manager "+ getName() +" have no more budget or have already hired this employee.");
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (budget < 15_000);
    }
}

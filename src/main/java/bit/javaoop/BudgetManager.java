package bit.javaoop;

public class BudgetManager extends AbstractManager {

    private double budget;
    private final int satisfying_spare_money=15000;

    public BudgetManager(String name, double salary, double budget, Company company) {
        super(name, salary, company);
        this.budget = budget;
    }

    @Override
    public boolean canHire(AbstractEmployee employee) {
        return (budget > employee.getSalary()) && (!this.getEmployeesList().contains(employee));
    }

    @Override
    public void hireNewEmployee(AbstractEmployee employee, Company company) {
        if (canHire(employee)) {
            budget -= employee.getSalary();
            insertToEmployeesList(employee);
            if (company.checkIfEmployeeWorkInThisCompany(employee))
                company.deleteFromEmployeesList(employee);
            System.out.println("Manager "+ getName() +" has hired "+employee.getName()+".");
        } else
            System.out.println("Manager "+ getName() +" have no more budget or have already hired this employee.");
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > satisfying_salary) && (budget < satisfying_spare_money);
    }
}

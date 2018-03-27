package bit.javaoop.people;

import bit.javaoop.CompanyAppException;
import bit.javaoop.CompanyAppExceptionMessage;

public class FixedBudgetManager extends Manager {

    private final double hiringBudget;

    public FixedBudgetManager(String name, double salary, double hiringBudget) {
        super(name, salary);
        this.hiringBudget = hiringBudget;
    }

    @Override
    public boolean canHireEmployee(AbstractEmployee employee) throws CompanyAppException {
        return super.canHireEmployee(employee) && getAllEmployeesSalary() + employee.getSalary() < hiringBudget;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && hiringBudget - getAllEmployeesSalary() > 15_000;
    }

    @Override
    public void hire(AbstractEmployee employee) throws CompanyAppException {
        try {
            super.hire(employee);
        } catch (CompanyAppException ex) {
            if (ex.getMessage().equals(CompanyAppExceptionMessage.CAN_NOT_BE_HIRED.toString()))
                throw new CompanyAppException(CompanyAppExceptionMessage.BUDGET_OVERFLOW);
            else throw ex;
        }
    }

    private double getAllEmployeesSalary() {
        return getEmployees().stream().mapToDouble(AbstractEmployee::getSalary).sum();
    }
}

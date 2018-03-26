package bit.javaoop.people;

import bit.javaoop.CompanyAppException;
import bit.javaoop.CompanyAppExceptionMessage;

public class FixedEmployeeNumberManager extends Manager {

    private final int maxNumberOfEmployees;

    public FixedEmployeeNumberManager(String name, double salary, int maxNumberOfEmployees) {
        super(name, salary);
        this.maxNumberOfEmployees = maxNumberOfEmployees;
    }

    @Override
    public boolean canHireEmployee(AbstractEmployee employee) throws CompanyAppException {
        return super.canHireEmployee(employee) && getEmployees().size() < maxNumberOfEmployees;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && getEmployees().size() == maxNumberOfEmployees;
    }

    @Override
    public void hire(AbstractEmployee employee) throws CompanyAppException {
        try {
            super.hire(employee);
        } catch (CompanyAppException ex) {
            if (ex.getMessage().equals(CompanyAppExceptionMessage.CAN_NOT_BE_HIRED.toString()))
                throw new CompanyAppException(CompanyAppExceptionMessage.EMPLOYEES_LIMID_EXCEEDED);
            else throw ex;
        }
    }
}

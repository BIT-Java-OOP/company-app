package bit.javaoop.people;

import bit.javaoop.CompanyAppException;
import bit.javaoop.CompanyAppExceptionMessage;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Manager extends AbstractEmployee {

    private final Set<AbstractEmployee> employees = new HashSet<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public boolean canHireEmployee(AbstractEmployee employee) throws CompanyAppException {
        if (employees.contains(employee))
            throw new CompanyAppException(CompanyAppExceptionMessage.EMPLOYEE_ALREADY_HIRED);
        return true;
    }

    public void hire(AbstractEmployee employee) throws CompanyAppException {
        if (employee == null) throw new CompanyAppException(CompanyAppExceptionMessage.NULL_ARG);

        if (canHireEmployee(employee)) {
            employees.add(employee);
        } else {
            throw new CompanyAppException(CompanyAppExceptionMessage.CAN_NOT_BE_HIRED);
        }
    }

    public Set<AbstractEmployee> getEmployees() {
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return super.equals(manager) && Objects.equals(employees, manager.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employees);
    }
}

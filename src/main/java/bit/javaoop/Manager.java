package bit.javaoop;

import static bit.javaoop.Company.companyEmployees;

public class Manager extends AbstractEmployee {
    protected Employee[] staff = new Employee[companyEmployees];
    private int numberOfEmployees = 0;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Employee[] getStaff() {
        return staff;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    private boolean canHire() {
        return getNumberOfEmployees() < getStaff().length;
    }

    public void Hire(Employee employee) {
        if (canHire()) {
            getStaff()[getNumberOfEmployees()] = employee;
            ++numberOfEmployees;
        } else
            System.out.println("Cannot Hire " + employee.getName());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 15_000;
    }

    @Override
    public String toString() {
        return "Manager " + getName();
    }
}

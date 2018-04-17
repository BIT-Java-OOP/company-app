package bit.javaoop.company;

import bit.javaoop.employmentpolicy.EmploymentPolicy;
import bit.javaoop.salarycalculator.SalaryCalculator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    public AbstractManager(String name, double salary, EmploymentPolicy employmentPolicy, SalaryCalculator salaryCalculator) {
        super(name, salary, employmentPolicy, salaryCalculator);
    }

    private List<AbstractEmployee> listOfEmployees = new ArrayList<>();

    public List<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public abstract boolean canHireNewEmployee();

    public boolean hireIfPossible(Employee employee) {
        if (canHireNewEmployee()) {
            listOfEmployees.add(employee);
            return true;
        } else {
            return false;
        }
    }

}

package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.policy.EmploymentPolicy;

import java.util.ArrayList;


public abstract class AbstractManager extends AbstractEmployee {

    //  private double satisfyingSalary = 20_000;

    public ArrayList<AbstractEmployee> employees;

    public AbstractManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        super(name, salary,  salaryCalculator, employmentPolicy);
        this.employees = new ArrayList<>();
    }

    public int getEmployeesQuantity() {
        return employees.size();
    }

    public ArrayList<AbstractEmployee> getEmployeesList() {
        return employees;
    }

    public void hireEmployee(AbstractEmployee newEmployee) {
        employees.add(newEmployee);
    }

    public abstract boolean checkHirePossibility();

}
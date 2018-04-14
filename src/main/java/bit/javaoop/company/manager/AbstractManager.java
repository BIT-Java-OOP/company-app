package bit.javaoop.company.manager;
import bit.javaoop.calculator.NetRevenueCalculator;
import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.employment.EmploymentContract;
import bit.javaoop.employment.EmploymentPolicy;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    private List<AbstractEmployee> listOfEmployees;

    public AbstractManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy,List<AbstractEmployee> listOfEmployees) {
        super(name, salary, salaryCalculator,employmentPolicy);
        this.listOfEmployees = listOfEmployees;
    }

    public AbstractManager(String name, double salary){
        super(name,salary,new NetRevenueCalculator(),new EmploymentContract());
        this.listOfEmployees = new ArrayList<>();
    }


    public List<AbstractEmployee> getListOfEmployees() {
        return listOfEmployees;
    }

    public abstract boolean hireIfPossible(AbstractEmployee employee);
}

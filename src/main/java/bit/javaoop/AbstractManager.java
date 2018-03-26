package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    private List<AbstractEmployee> employeesList;
    public final int satisfying_salary=20000;

    public AbstractManager(String name, double salary) {
        super(name, salary);
        this.employeesList = new ArrayList<>();
    }

    public AbstractManager(String name, double salary, Company company) {
        super(name, salary);
        this.employeesList = new ArrayList<>();
        company.insertToManagersList(this);
    }

    public List<AbstractEmployee> getEmployeesList() {
        return employeesList;
    }

    public abstract boolean canHire(AbstractEmployee employee);

    public abstract void hireNewEmployee(AbstractEmployee employee, Company company);

    public void insertToEmployeesList(AbstractEmployee employee) {
        employeesList.add(employee);
    }

    @Override
    public String toString() {
        StringBuilder returningStringManagerEmployeeList = new StringBuilder("\t" + getName() + " - Manager\n");
        for (AbstractEmployee employe : employeesList) {
            returningStringManagerEmployeeList.append("\t\t" + employe.getName() + " - Employee\n");
        }
        return returningStringManagerEmployeeList.toString();
    }
}

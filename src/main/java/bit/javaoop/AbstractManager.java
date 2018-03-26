package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    private List<AbstractEmployee> employeesList;

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

    public abstract boolean canHire(AbstractEmployee employ);

    public abstract void hireNewEmployee(AbstractEmployee employ, Company company);

    public void insertToEmployeesList(AbstractEmployee employee) {
        employeesList.add(employee);
    }

    @Override
    public String toString() {
        String returningStringManagerEmployeeList = "\t" + getName() + " - Manager\n";
        for (AbstractEmployee employe : employeesList) {
            returningStringManagerEmployeeList += "\t\t" + employe.getName() + " - Employee\n";
        }
        return returningStringManagerEmployeeList;
    }
}

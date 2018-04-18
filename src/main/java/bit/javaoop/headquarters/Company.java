package bit.javaoop.headquarters;

import bit.javaoop.employees.Employee;
import bit.javaoop.managers.AbstractManager;

import java.util.ArrayList;


public class Company {
    private String companyName;
    protected CEO ceo;
    ArrayList<AbstractManager> managersList;

    public Company(String companyName, String ceoName) {
        this.companyName = companyName;
        this.ceo = new CEO(ceoName);
    }

    public CEO getCeo() {
        return ceo;
    }

    public String toString() {
        StringBuilder text = new StringBuilder("Company name: ")
                .append(companyName)
                .append("\n")
                .append(ceo.getName())
                .append(" - CEO\n");
        for (AbstractManager manager : ceo.getManagersList()) {
            text.append("\t").append(manager.toString()).append("\n");

            for (Employee employee : manager.getEmployeesList()) {
                text.append("\t").append("\t").append(employee.toString()).append("\n");
            }
        }
        return text.toString();
    }
}


package bit.javaoop.headquartersPackage;

import bit.javaoop.employeesPackage.Employee;
import bit.javaoop.managersPackage.Manager;

import java.util.ArrayList;

import static bit.javaoop.managersPackage.Manager.employeesList;

public class Company {
    private String companyName;
    private String CEOname;
    ArrayList<Manager> managersList;

    public Company(String companyName, String CEOname) {
        this.companyName = companyName;
        this.CEOname = CEOname;
        CEO chosenCEO = new CEO(CEOname);
    }

    public String toString() {
        StringBuilder tab = new StringBuilder(" ");
        StringBuilder text = new StringBuilder("Company name: ");
        text.append(companyName + "\n");
        text.append(CEOname + " - CEO\n");
        for (Manager manager : managersList) {
            text.append(tab.append(manager.tellName(manager)));
            text.append("\n");

            for (Employee employee : employeesList) {
                text.append(tab.append(tab.append(employee.tellName(employee))));
                text.append("\n");
            }
        }
        return text.toString();
    }
}


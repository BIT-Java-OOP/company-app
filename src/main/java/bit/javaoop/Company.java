package bit.javaoop;

import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.manager.CEO;
import bit.javaoop.company.manager.AbstractManager;

public class Company {

    private String name;
    private CEO currentCEO;

    Company(String name, CEO currentCEO) {
        this.name = name;
        this.currentCEO = currentCEO;
    }

    @Override
    public String toString() {
        StringBuilder companyHierarchyDisplayBuilder = new StringBuilder();

        companyHierarchyDisplayBuilder.append(currentCEO.getName() + " - CEO\n");

        for (AbstractManager manager : currentCEO.getListOfManagers()) {
            companyHierarchyDisplayBuilder.append("\t" + manager.getName() + " - Manager," + manager.getEmploymentPolicy().getPolicy() + "\n");
            for (AbstractEmployee employee : manager.getListOfEmployees()) {
                companyHierarchyDisplayBuilder.append("\t\t" + employee.getName() + " - Employee,"+employee.getEmploymentPolicy().getPolicy()+"\n");
            }
        }

        return companyHierarchyDisplayBuilder.toString();
    }
}

package bit.javaoop;

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

        for (Manager manager : currentCEO.getListOfManagers()) {
            companyHierarchyDisplayBuilder.append("\t"+manager.getName() + " - Manager\n");
            for (AbstractEmployee employee : manager.getListOfEmployees()) {
                companyHierarchyDisplayBuilder.append("\t\t"+employee.getName() + " - Employee\n");
            }
        }

        return companyHierarchyDisplayBuilder.toString();
    }
}

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
        StringBuilder letsBuildAHierarchy = new StringBuilder();

        letsBuildAHierarchy.append(currentCEO.getName()+" - CEO\n");

        for (Menager menager : currentCEO.getListOfMenagers()) {
            letsBuildAHierarchy.append("\t");
            letsBuildAHierarchy.append(menager.getName()+" - Menager\n");
            for (AbstractEmployee employee : menager.getListOfEmployees()) {
                letsBuildAHierarchy.append("\t\t");
                letsBuildAHierarchy.append(employee.getName()+" - Employee\n");
            }
        }

        return letsBuildAHierarchy.toString();
    }

    public void setCurrentCEO(CEO currentCEO) {
        this.currentCEO = currentCEO;
    }
}

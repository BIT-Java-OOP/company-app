package bit.javaoop;

public class Company {
    private final String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public void hireNewCeo(CEO newCeo) {
        newCeo.setManagers(ceo.getManagers());
        ceo = newCeo;
    }

    @Override
    public String toString() {
        StringBuilder companyStringBuilder = new StringBuilder();
        companyStringBuilder.append(ceo.toString()).append("\n");
        for (Manager manager : ceo.getManagers()) {
            companyStringBuilder.append("\t").append(manager.toString()).append("\n");
            for (Employee employee : manager.getEmployees()) {
                companyStringBuilder.append("\t\t").append(employee.toString()).append("\n");
            }
        }
        return companyStringBuilder.toString();
    }

}

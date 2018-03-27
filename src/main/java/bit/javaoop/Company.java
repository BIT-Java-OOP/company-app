package bit.javaoop;

public class Company {
    public static final int companyEmployees = 2;
    public static final int companyManagers = 3;
    private String companyName;
    private CEO companyCEO;

    public Company(String companyName, CEO companyCEO) {
        this.companyName = companyName;
        this.companyCEO = companyCEO;
    }

    public static int getCompanyEmployees() {
        return companyEmployees;
    }

    public static int getCompanyManagers() {
        return companyManagers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CEO getCompanyCEO() {
        return companyCEO;
    }

    public void setCEO(CEO ceo) {
        System.out.println("CEO " + companyCEO.getName() + " is fired");
        companyCEO = ceo;
        System.out.println("CEO " + companyCEO.getName() + " is hired");
    }

    @Override
    public String toString() {
        System.out.println("\n" + getCompanyName() + "\n");
        System.out.println(companyCEO.toString());

        for (Manager manager : companyCEO.getManagers()) {
            System.out.println("\t" + manager.toString());

            for (Employee employee : manager.getStaff()) {
                System.out.println("\t\t" + employee.toString());
            }
        }
        return getCompanyName();
    }
}

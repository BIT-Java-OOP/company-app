package bit.javaoop;

import com.sun.tools.javac.util.List;

public class Company {
    private String companyName;
    private String CEOname;
    private double CEOsalary;
    List<Manager> managersList;
    public void createCompany (String companyName, String CeoName, double ceoSalary) {

        public Company(String CEOname, double CEOsalary) {
            this.CEOname = CEOname;
            this.CEOsalary = CEOsalary;

        }
    }
    public String toString(){
        System.out.println( CEO.toString());

        for ( Manager m : CEO.getManagers ){
            System.out.println(“\t” + manager toString());

            for ( Employee e : m.getEmployees ){
                System.out.println(“\t\t” + employee toString());
            }
        }
    }
    public void addManager (Manager manager) {
        managersList.add(manager);
    }

    public void setManagersList(List<Manager> managersList) {
        Object manager;
        this.managersList = addManager(Manager manager);
    }

    public String setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String setCEOname(String CEOname) {
        this.CEOname = CEOname;
    }

    public void setCEOsalary(double CEOsalary) {
        this.CEOsalary = CEOsalary;
    }
    
}

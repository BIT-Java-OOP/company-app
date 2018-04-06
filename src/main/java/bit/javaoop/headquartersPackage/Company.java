package bit.javaoop.headquartersPackage;

import com.sun.tools.javac.util.List;

public class Company {
    private String companyName;
    private String CEOname;
    private double CEOsalary;
    List<Manager> managersList;
    public static String toString();

    public Company(String companyName, String CEOname, double CEOsalary) {
        this.companyName = companyName;
        this.CEOname = CEOname;
        this.CEOsalary = CEOsalary;}

    public void addManager (Manager manager) {
        managersList.add(manager);
    }

    public void setManagersList(List<Manager> managersList) {
        Object manager;
        this.managersList = addManager(manager);
    }

    private String setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public String setCEOname(String CEOname) {
        this.CEOname = CEOname;
    }

    public void setCEOsalary(double CEOsalary) {
        this.CEOsalary = CEOsalary;
    }
   // public String toString(){
     //   System.out.println( CEOname.toString());

 //       for ( Manager m : CEOname.addManager ){
   //         System.out.println(“\t” + m.toString());    pokazuje błędy z np. \t

         //   for ( Employee e : m.getEmployees ){
           //     System.out.println(“\t\t” + e.toString());
           // }
       // }
    }


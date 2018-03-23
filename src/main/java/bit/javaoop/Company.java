package bit.javaoop;

public class Company {
    private String name;
    private CEO currentCEO;
    private boolean doWeHaveCEO;

    public Company(String name) {
        this.name = name;
        this.doWeHaveCEO = false;
    }

    public void hireCEO(CEO newCEO) {
        this.doWeHaveCEO = true;
        this.currentCEO = newCEO;
    }

    @Override
    public String toString() { // to nie do konca zrozumialem czy o to chodzilo
        String tab = "    ";
        System.out.println(currentCEO.getName() + " - CEO ");
        int hisManagers = currentCEO.howManyManagers();
        for (int i = 0; i < hisManagers; i++) {
            Manager manager = currentCEO.getManager(i);
            System.out.println(tab + manager.getName() + " - Manager ");
            int hisEmployees = manager.howManyEmployees();
            for (int j = 0; j < hisEmployees; j++) {
                Employee employee = manager.getEmployee(j);
                System.out.println(tab + tab + employee.getName() + " - Employee ");
            }
        }
        return "Done";
    }
}

package bit.javaoop;

public class Company {

    private String name;
    private CEO ceoEmployee;

    public Company(String name, CEO ceoEmployee) {
        this.name = name;
        this.ceoEmployee = ceoEmployee;
    }

    public void hire(CEO newCeo) {
        this.ceoEmployee = newCeo;
    }

    public String toString() {
        String companyText = "";

        companyText += ceoEmployee.getName() + " - CEO\n";

        for(Manager manager : ceoEmployee.getManagers()) {
            companyText += "    " + manager.getName() + " - Manager\n";
            for(Employee employee : manager.getEmployees()) {
                companyText += "        " + employee.getName() + " - Employee\n";
            }
        }

        return companyText;
    }
}

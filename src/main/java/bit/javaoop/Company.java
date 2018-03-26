package bit.javaoop;

import java.util.LinkedList;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public void hireNewCeo(CEO newCeo){
        newCeo.setManagers(ceo.getManagers());
        ceo = newCeo;
    }

    @Override
    public String toString() {
        StringBuilder companyStringBuilder = new StringBuilder();
        companyStringBuilder.append(ceo.toString() + "\n");
        for (Manager manager : ceo.getManagers()) {
            companyStringBuilder.append("\t" + manager.toString() + "\n");
            for (Employee employee : manager.getEmployees()) {
                companyStringBuilder.append("\t\t" + employee.toString() + "\n");
            }
        }
        return companyStringBuilder.toString();
    }

}

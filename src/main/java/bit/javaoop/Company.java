package bit.javaoop;

import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.AbstractManager;
import bit.javaoop.company.CEO;

public class Company {

    private String name;
    private CEO ceo;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public void hireCeo(CEO newCeo) {
        this.ceo = newCeo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (ceo == null) return "There's no ceo!";
        StringBuilder result = new StringBuilder();
        result.append(ceo.getName())
                .append(" - CEO\n");
        for (AbstractManager manager : ceo.getManagersList()) {
            result.append("\t\t")
                    .append(manager.getName())
                    .append(" - Manager\n");
            for (AbstractEmployee employee : manager.getEmployeesList()) {
                result.append("\t\t\t\t")
                        .append(employee.getName())
                        .append(" - Employee\n");
            }
        }
        return result.toString();
    }
}
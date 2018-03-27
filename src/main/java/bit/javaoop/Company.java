package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }


    public String getCeo() {
        return ceo.getName();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.getCeo() + " - CEO\n");
        for (Manager manager : ceo.getManagerList()) {
            result.append("\t").append(manager.getName()).append(" - Manager\n");
            for (AbstractEmployee employee : manager.getMyStaffList()) {
                result.append("\t\t").append(employee.getName()).append(" - Employee\n");
            }
        }
        return result.toString();
    }
}

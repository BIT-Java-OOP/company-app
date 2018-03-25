package bit.javaoop;

public class Company {
    String name;
    CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }


    public String getCeo() {
        return ceo.name;
    }

    @Override
    public String toString() {
        String result = this.getCeo() + " - CEO\n";
        for (Manager manager : ceo.managerList) {
            result += "\t" + manager.getName() + " - Manager\n";
            for (AbstractEmployee employee : manager.getMyStaffList()) {
                result += "\t\t" + employee.getName() + " - Employee\n";
            }
        }
        return result;
    }
}

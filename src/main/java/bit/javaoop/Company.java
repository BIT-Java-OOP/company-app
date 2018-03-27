package bit.javaoop;

public class Company {
    private String name;
    private CEO employee;

    public Company(String name) {  //constructors should be placed first, press ctr + alt + sfhit + L
        this.name = name;
    }

    public void hireNewCeo(CEO newCeo) {
        if (employee == null) employee = newCeo;
        else {
            for (int i = 0; i < employee.ManagerList().size(); i++) {
                newCeo.addManager(employee.ManagerList().get(i));
            }
            employee = newCeo;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " - Company name\n" + employee.toString();
    }
}

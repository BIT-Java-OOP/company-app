package bit.javaoop;

public class Company {

    private String name;
    private CEO ceo;


    Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public void hireNewCeo(CEO newCeo) {
        newCeo.setManagersList(getCeo().getManagersList());
        setCeo(newCeo);
    }

    @Override
    public String toString() {
        StringBuilder company = new StringBuilder();
        company.append(getName() + "\n");
        company.append("\t" + getCeo().toString() + "\n");
        for (Manager manager : ceo.getManagersList()) {
            company.append("\t\t" + manager.toString() + "\n");
            for (Employee employee : manager.getEmployees()) {
                company.append("\t\t\t" + employee.toString() + "\n");
            }
        }
        return company.toString();
    }


    public String getName() {
        return name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}

package bit.javaoop;
//
//import java.util.ArrayList;
//import java.util.List;

public class Company {

    private String name;
    private CEO ceo;


    Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;

    }

    Company(String name) {
        this(name, new CEO());
    }

    public void hireNewCeo(CEO newCeo) {
        newCeo.setManagersList(getCeo().getManagersList());
        setCeo(newCeo);
    }

//    public List<Manager> getManagerList() {
//        return getCeo().getManagersList();
//    }

    @Override
    public String toString() {
        StringBuilder company = new StringBuilder();
        company.append(getName() + "\n");
        company.append("\t" + getCeo().toString() + "\n");
        for (Manager manager : ceo.getManagersList()) {
            company.append("\t\t" + manager.toString() + "\n");
            for (Employee employee : manager.getEmployees()
                    ) {
                company.append("\t\t\t" + employee.toString() + "\n");
            }

        }
        return company.toString();
    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}

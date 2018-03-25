package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

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

    public List<Manager> getManagerList() {
        return getCeo().getManagersList();
    }

    @Override
    public String toString() {
        String company = getName() + "\n";
        company += getCeo().toString();
        return company.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}

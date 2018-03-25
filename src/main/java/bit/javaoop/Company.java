package bit.javaoop;

public class Company {
    private String name;
    private CEO actualCEO;

    public Company(String name) {
        this.name = name;
    }

    public void hireCEO(CEO newCEO){
            actualCEO = newCEO;
    }

    @Override
    public String toString() {
        return name + " - CEO\n" + actualCEO.getListOfManagers().toString();
    }
}

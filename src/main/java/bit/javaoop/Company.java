package bit.javaoop;

public class Company {
    String name;
    CEO ceo;
    boolean isCEOhired=false;

    public Company(String name) {
        this.name = name;
    }

    void hireCEO(CEO ceo)
    {
        if(isCEOhired) this.ceo.setName(ceo.getName());
        else this.ceo=ceo;
    }

    @Override
    public String toString() {
        return ceo.toString();
    }
}

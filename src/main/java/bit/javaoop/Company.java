package bit.javaoop;

public class Company {
    private ChiefExecutiveOfficer CEO;
    private final String name;
    public Company(String name, ChiefExecutiveOfficer CEO) {
        this.name = name;
        this.CEO = CEO;
    }

    public void hireChiefExecutiveOfficer(ChiefExecutiveOfficer CEO) {
        this.CEO = CEO;
    }

    public ChiefExecutiveOfficer getChiefExecutiveOfficer() {
        return CEO;
    }

    @Override
    public String toString() {
        return name + ":\n" + CEO.toString();
    }
    public String getName(){
        return name;
    }
}

package bit.javaoop;

public class Company extends NamedObject {
    private ChiefExecutiveOfficer CEO;

    public Company(String name, ChiefExecutiveOfficer CEO) {
        super(name);
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
        return getName() + ":\n" + CEO.toString();
    }
}

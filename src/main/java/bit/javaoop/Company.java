package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name) {
        this.name = name;
    }

    public void hireCEO(CEO newCEO) {
        ceo = newCEO;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder("");
        sB.append(ceo.getName()).append(" - CEO\n");

        for (AbstractManager m : ceo.getListOfManagers()) {
            sB.append("\t").append(m.getName()).append(" - Manager\n");
            for (AbstractEmployee e : m.getListOfEmployees()) {
                sB.append("\t\t").append(e.getName()).append(" - Employee\n");
            }
        }
        return sB.toString();
    }
}

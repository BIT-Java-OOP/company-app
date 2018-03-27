package bit.javaoop;

public class Company {
    public Company(String name) {
        this.name = name;
    }

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    private String name;
    private CEO ceo;

    public void hireCEO(CEO c) {
        this.ceo = c;
    }

    public String toString() {
        if (ceo == null) return "NO CEO!";
        StringBuilder sb = new StringBuilder();
        sb.append(ceo.getName());
        sb.append(" - CEO\n");
        for (AbstractManager m : ceo.getManagers()) {
            sb.append("\t");
            sb.append(m.getName());
            sb.append(" - Manager\n");
            for (AbstractEmployee e : m.getEmployees()) {
                sb.append("\t\t");
                sb.append(e.getName());
                sb.append(" - Employee\n");

            }
        }
        return sb.toString();
    }
}

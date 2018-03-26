package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public Company(String name) {
        this.name = name;
    }

    public void hireCEO(CEO ceo) {
        fireCEO();
        this.ceo = ceo;
    }

    public void fireCEO() {
        this.ceo = null;
    }

    public String getName() {
        return name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (ceo == null) return "No CEO hired :c";
        StringBuilder sb = new StringBuilder();
        sb.append(ceo.getName());
        sb.append(" - CEO\n");
        for (AbstractManager m : ceo.getManagers()) {
            sb.append("\t");
            sb.append(m.getName());
            sb.append(" - Manager\n");
            for (AbstractEmployee e : m.getEmployees()) {
                sb.append("\t\t");
                sb.append(m.getName());
                sb.append(" - Employee\n");
            }
        }
        return sb.toString();
    }
}

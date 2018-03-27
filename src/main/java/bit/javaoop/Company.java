package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }


    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        ceo.setManagers_list(getCeo().getManagers_list());
        this.ceo = ceo;
    }


    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(getCeo()).append("\n");
        for (int i = 0; i < getCeo().getManagers_list().size(); i++) {
            text.append("\t").append(getCeo().getManagers_list().get(i)).append("\n");
            for (int j = 0; j < getCeo().getManagers_list().get(i).getEmployees_list().size(); j++) {
                text.append("\t\t").append(getCeo().getManagers_list().get(i).getEmployees_list().get(j)).append("\n");
            }
        }
        return text.toString();
    }
}

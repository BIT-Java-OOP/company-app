package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
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

    @Override
    public String toString() {
        String response = getCeo().getName() + " - CEO\n";
        for (AbstractManager manager: getCeo().getManagers()) {
            response = response + "\t" + manager.getName() + " - Manager\n";
            for (AbstractEmployee employee: manager.getEmployees()) {
                response = response + "\t\t" + employee.getName() + " - Employee\n";
            }
        }

        return response;
    }
}

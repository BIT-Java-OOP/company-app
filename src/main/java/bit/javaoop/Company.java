package bit.javaoop;

public class Company {


    private String name;
    private Ceo ceo;

    public Company(String name, Ceo ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    public String getName() {
        return name;
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void hireCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ceo.toString());
        stringBuilder.append("\n");

        for(AbstractManager manager : ceo.getManagers()) {
            stringBuilder.append("\t");
            stringBuilder.append(manager.toString());
            stringBuilder.append("\n");

            for(AbstractEmployee employee : manager.getEmployees()) {
                stringBuilder.append("\t\t");
                stringBuilder.append(employee.toString());
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
}

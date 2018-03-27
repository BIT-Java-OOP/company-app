package bit.javaoop;

public class Company {
    private CEO ceo;
    private String name;

    public Company(CEO ceo, String name) {
        this.ceo = ceo;
        this.name = name;
    }

    @Override
    public String toString() {
        String result = new String();
        result += ceo.getName() + " - CEO\n";
        for (AbstractEmployee employee : ceo.getEmployees()) {
            result += employee.toString(1);
        }
        return result;
    }

    public void hire(AbstractEmployee employee) {
        ceo.addEmployee(employee);
    }

}

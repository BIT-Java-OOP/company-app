package bit.javaoop;

import java.util.ArrayList;

public class Company {

    private CEO ceo;
    private String name;

    public Company(String name, CEO ceo) {
        this.ceo = ceo;
        this.name = name;
    }

    public void hire(AbstractEmployee employee) {
        ceo.addEmployee(employee);

    }

    @Override
    public String toString() {
        String result = new String();
        result += ceo.getName() + " - CEO\n";
        for (AbstractEmployee e : ceo.getListOfEmployees()) {
            result += e.toString(1);
        }
        return result;
    }
}

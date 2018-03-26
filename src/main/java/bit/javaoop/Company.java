package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public void hire_ceo(String name_new_ceo) {
        this.ceo.setName(name_new_ceo);
    }

    public Company(String name, CEO ceo) {
        this.name = name;
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        String result = "Company " + this.name + "\n ";
        result = result + ceo.getName() + " - CEO\n";
        for(Manager x : ceo.getManagers()){
            result = result + "\t" + x.getName() + " - Manager\n";
            for(Employee y : x.getHired_employees())
            {
                result = result + "\t\t" + y.getName() + " - Employee\n";
            }
        }
        return result;
    }
}

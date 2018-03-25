package bit.javaoop;

public class Company {
    private String name;
    private CEO employee;

    public void hireNewCeo(CEO new_ceo){
        if(employee == null) employee = new_ceo;
        else{
            for(int i = 0; i < employee.getManagerLists().size(); i++){
                new_ceo.addManager(employee.getManagerLists().get(i));
            }
            employee = new_ceo;
        }
    }

    public Company(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String output;
        output = getName() + " - Company name\n";
        output += employee.printManagers();
        return output;
    }
}

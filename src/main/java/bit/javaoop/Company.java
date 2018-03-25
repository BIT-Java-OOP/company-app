package bit.javaoop;

public class Company {

    private String name;

    private CEO CEO;

    public Company(CEO ceo, String name){
        CEO=ceo; this.name=name;
    }

    public void hireCEO(CEO ceo){
        CEO=ceo;
    }

    @Override
    public String toString() {

        String result=this.getName()+"\n";

        for (Manager m : CEO.getManagers()){
            result+="\t"+m.getName()+"\n";
            for (Employee e : m.Hired){
                result+="\t\t"+e.getName()+"\n";
            }
        }

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

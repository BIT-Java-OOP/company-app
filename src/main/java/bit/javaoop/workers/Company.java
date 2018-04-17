package bit.javaoop.workers;

public class Company {

    private String name;

    private bit.javaoop.workers.CEO CEO;

    public Company(CEO ceo, String name){
        CEO=ceo; this.name=name;
    }

    public void hireCEO(CEO ceo){
        CEO=ceo;
    }

    @Override
    public String toString() {

        String result=this.getName()+"\n"+"CEO: "+CEO.getName()+"\n";

        for (AbstractManager m : CEO.getManagers()){
            result+="\t MANAGER: "+m.getName()+"\n";
            for (Employee e : m.Hired){
                result+="\t\t EMPLOYEE: "+e.getName()+"\n";
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

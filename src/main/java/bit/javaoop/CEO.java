package bit.javaoop;
import java.util.ArrayList;
import java.util.List;
public class CEO {
    private String name;
    private List<AbstractManager> ManagerLists = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<AbstractManager> getManagerLists() {
        return ManagerLists;
    }

    public void setManagerLists(List<AbstractManager> managerLists) {
        ManagerLists = managerLists;
    }

    public CEO(String name) {
        this.name = name;
    }
    public void addManager(AbstractManager manager){
        ManagerLists.add(manager);
    }

    public String printManagers(){
        String output;
        output = "\t" + getName() + " - CEO\n";
        for(int i = 0; i < ManagerLists.size(); i++){
            output += ManagerLists.get(i).printEmployees();
        }
        return output;
    }
}

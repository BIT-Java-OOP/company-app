package bit.javaoop;
import java.util.ArrayList;
import java.util.List;
public class CEO {

    private String name;
    private List<AbstractManager> ManagerLists = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<AbstractManager> ManagerList() {
        return ManagerLists;
    }

    public CEO(String name) {
        this.name = name;
    }
    public void addManager(AbstractManager manager){
        ManagerLists.add(manager);
    }

    @Override
    public String toString(){
        StringBuilder output;
        output = new StringBuilder("\t" + getName() + " - CEO\n");
        for (AbstractManager ManagerList : ManagerLists) {
            output.append(ManagerList.toString());
        }
        return output.toString();
    }
}

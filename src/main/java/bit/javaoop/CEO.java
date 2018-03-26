package bit.javaoop;
import java.util.LinkedList;
import java.util.List;

public class CEO {

    public CEO(String name) {
        this.name = name;
    }

    public List<AbstractManager> getManagers() {
        return managers;
    }

    public String getName() {

        return name;
    }

    public void addMenager(AbstractManager m){
      managers.add(m);
    }
    private String name;
    private List<AbstractManager> managers = new LinkedList<>();

}

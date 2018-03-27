package bit.javaoop;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {
    private List<AbstractEmployee> EmployeeList = new ArrayList<>();
    public AbstractManager(String name, double salary) {
        super(name,salary);
    }

    public List<AbstractEmployee> getEmployeeList() {
        return EmployeeList;
    }

    @Override
    public String toString(){
        StringBuilder output;
        output = new StringBuilder("\t\t" + getName() + " - Manager\n");
        for (AbstractEmployee aEmployeeList : EmployeeList) {                              //for each loop better than iterate like in cpp
            output.append("\t\t\t").append(aEmployeeList.getName()).append(" - Employee\n"); // stringBuilder than  output +=
        }
        return output.toString();
    }

    public abstract void hire(AbstractEmployee employee);
    public abstract boolean canHire(AbstractEmployee employee);
}

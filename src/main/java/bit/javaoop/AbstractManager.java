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

    public void setEmployeeList(List<AbstractEmployee> employeeList) {
        EmployeeList = employeeList;
    }

    public String printEmployees(){
        String output;
        output = "\t\t" + getName() + " - Manager\n";
        for(int i = 0; i < EmployeeList.size(); i++){
            output += "\t\t\t" + EmployeeList.get(i).getName() + " - Employee\n";
        }
        return output;
    }

    public abstract void hire(AbstractEmployee employee);
    public abstract boolean CanHire(AbstractEmployee employee);
}

package bit.javaoop;
import java.util.ArrayList;
import java.util.List;
public class CEO {

    private String name;
    private List<AbstractManager> managerList = new ArrayList<>();
    private EmploymentPolicy employmentPolicy;
    private SalaryCalculator salaryCalculator;

    public String getName() {
        return name;
    }

    public List<AbstractManager> ManagerList() {
        return managerList;
    }

    public CEO(String name, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        this.name = name;
        this.employmentPolicy = employmentPolicy;
        this.salaryCalculator = salaryCalculator;
    }

    public void addManager(AbstractManager manager){
        managerList.add(manager);
    }

    @Override
    public String toString(){
        StringBuilder output;
        output = new StringBuilder("\t" + getName() + " - CEO\n");
        for (AbstractManager m : managerList) {
            output.append(m.toString());
        }
        return output.toString();
    }
}

package bit.javaoop;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {
    private List<AbstractEmployee> employeeList = new ArrayList<>();
    public AbstractManager(String name, double salary, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy) {
        super(name,salary,salaryCalculator, employmentPolicy);
    }

    public List<AbstractEmployee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString(){
        StringBuilder output;
        output = new StringBuilder("\t\t" + getName() + " - Manager\n");
        for (AbstractEmployee e : employeeList) {                              //for each loop better than iterate like in cpp
            output.append("\t\t\t").append(e.getName()).append(" - Employee\n"); // stringBuilder than  output +=
        }
        return output.toString();
    }

    public abstract void hire(AbstractEmployee employee);
    public abstract boolean canHire(AbstractEmployee employee);

    public void streamOutput(){
        employeeList.stream().forEach(System.out::println);
    }
}

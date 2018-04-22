package bit.javaoop.policy;

public class EmploymentContract implements EmploymentPolicy {
    @Override
    public String getEmploymentPolicy(){
        return "Policy: employment contract";
    }
}
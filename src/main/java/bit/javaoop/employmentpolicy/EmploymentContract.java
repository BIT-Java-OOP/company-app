package bit.javaoop.employmentpolicy;

public class EmploymentContract implements EmploymentPolicy {
    @Override
    public String getEmploymentPolicy() {
        return "Contract employment";
    }
}

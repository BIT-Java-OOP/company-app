package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int max_employees;

    public FixedEmployeeNumberManager(int salary, String name, int max_employees) {
        super(salary, name);
        this.max_employees = max_employees;
    }

    @Override
    public boolean canHire() {
        return (this.getHired_employees().size() < this.max_employees);
    }

    @Override
    public boolean isSatisfied() {
        return (this.getHired_employees().size() == this.max_employees && this.getSalary() > 20_000);
    }

    @Override
    public void hire(Employee new_employee) {
        if (this.canHire()) {
            this.getHired_employees().add(new_employee);
            this.max_employees++;
        } else {
            System.out.print("Too many employees!");
        }
    }
}

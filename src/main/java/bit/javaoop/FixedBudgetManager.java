package bit.javaoop;

public class FixedBudgetManager extends Manager {

    private double fixedBudget;

    public FixedBudgetManager(String name, double salary) {
        super(name, salary);
    }

    public boolean isSatisfied() {
        if (this.getSalary() > 20_000 && (this.currentBudget() < 15_000)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hireNewEmployee(Employee employee) {
        if ((this.currentStuffSalary() + employee.getSalary()) <= this.getFixedBudget()) {
            this.getMyStaffList().add(employee);
            return true;
        } else {
            System.out.println("You don't have enought money to hire new employee.");
            return false;
        }
    }

    public double currentStuffSalary() {
        double sum = 0;
        for (Employee employee : this.getMyStaffList()) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public double currentBudget() {
        return (this.getFixedBudget() - this.currentStuffSalary());

    }

    public double getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(double fixedBudget) {
        this.fixedBudget = fixedBudget;
    }
}

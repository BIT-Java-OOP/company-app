package bit.javaoop;

public class FixedBudgetManager extends Manager{

    double budget;

   FixedBudgetManager(String name, double salary, double budget) {
        super(name, salary);
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public boolean CanHire(Employee employee) {
        double SumofSalaries=employee.getSalary();
        for(Employee e: listofEmployees)
        {
            SumofSalaries+=e.getSalary();
        }
        return SumofSalaries<=getBudget();
    }

    @Override
    public boolean isSatisfied() {
        double sumofSalaries=0;
        for(Employee e: listofEmployees)
        {
            sumofSalaries+=e.getSalary();
        }
        double actualBudget=budget-sumofSalaries;
        return (getSalary() >20_000 && actualBudget<15_000);
    }
}

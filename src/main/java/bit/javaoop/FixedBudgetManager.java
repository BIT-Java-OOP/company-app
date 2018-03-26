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
        return (getSalary() >20_000 && getBudget()<15_000);
    }
}

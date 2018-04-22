package bit.javaoop.company;

import bit.javaoop.calculator.SalaryCalculator;
import bit.javaoop.policy.EmploymentPolicy;

public class FixedBudgetManager extends AbstractManager {

    private double maxBudget;
    private double satisfyingSalary = 20_000;
    private double minSpareMoney = 15_000;

    public FixedBudgetManager(String name, double salary, double maxBudget, SalaryCalculator salaryCalculator, EmploymentPolicy employmentPolicy){
        super(name, salary, salaryCalculator, employmentPolicy);
        this.maxBudget = maxBudget;
    }

    public double allSalaries(){
        double salaries = 0;
        for (AbstractEmployee employees : employees) {
            salaries += employees.getSalary();
        }
        return salaries;
    }

    public double getLeftBudget(){
        return maxBudget-allSalaries();
    }

    @Override
    public boolean checkHirePossibility(){
        return allSalaries() + this.getSalary() < maxBudget;
    }

    @Override
    public boolean isSatisfied(){
        return this.getSalary() > satisfyingSalary  && getLeftBudget() < minSpareMoney;
    }

    @Override
    public void hireEmployee(AbstractEmployee newEmployee){
        if(checkHirePossibility()){
            super.hireEmployee(newEmployee);
        }
        else{
            System.out.println("No money in budget");
        }
    }

}
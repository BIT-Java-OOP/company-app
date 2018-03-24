package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class BudgetManager extends AbstractEmployee implements ISuperior,ISubordinate {

    private double maxBudget;
    private List<ISubordinate> subordinatesList = new LinkedList<>();

    public BudgetManager(String name, double salary, double maxBudget) {
        super(name, salary);
        this.maxBudget = maxBudget;
    }


    @Override
    public List<ISubordinate> getSubordinates(){
        return this.subordinatesList;
    }

    public void setMaxBudget(double newBudget) {

        if(this.getSubordinatesCost() < newBudget) {
            this.maxBudget=newBudget;
        }
    }

    @Override
    public boolean isSatisfied(){
        return (this.getSalary() > 20_000 && ( maxBudget - this.getSubordinatesCost() < 15_000));
    }

    @Override
    public boolean canHireNewSubordinate(ISubordinate newEmployee){
        return this.getSubordinatesCost()+newEmployee.getSalary() < maxBudget;
    }

    @Override
    public void hireSubordinate(ISubordinate newEmployee){
        if(this.canHireNewSubordinate(newEmployee)){
            this.subordinatesList.add(newEmployee);
        }
    }

    private double getSubordinatesCost(){
        double acc = 0;
        for(ISubordinate subordinate : this.subordinatesList ){
            acc+=subordinate.getSalary();
        }
        return acc;
    }
}

package bit.javaoop;

import java.util.LinkedList;
import java.util.List;

public class NumberManager extends AbstractEmployee implements ISuperior,ISubordinate {

    private int maxSubordinatesNumber;
    private List<ISubordinate> subordinatesList = new LinkedList<>();

    public NumberManager(String name, double salary, int maxSubordinatesNumber) {
        super(name, salary);
        this.maxSubordinatesNumber = maxSubordinatesNumber;
    }

    @Override
    public List<ISubordinate> getSubordinates(){
        return this.subordinatesList;
    }

    public void setMaxSubordinatesNumber(int newMaxSubordinatesNumber) {
        if(this.subordinatesList.size() < newMaxSubordinatesNumber) {
            this.maxSubordinatesNumber = newMaxSubordinatesNumber;
        }
    }

    @Override
    public boolean isSatisfied(){
        return (this.getSalary() > 20_000 && this.subordinatesList.size() == maxSubordinatesNumber);
    }

    @Override
    public boolean canHireNewSubordinate(ISubordinate newEmployee){
        return this.subordinatesList.size() < maxSubordinatesNumber;
    }

    @Override
    public void hireSubordinate(ISubordinate newEmployee){
        if(this.canHireNewSubordinate(newEmployee)){
            this.subordinatesList.add(newEmployee);
        }
    }
}

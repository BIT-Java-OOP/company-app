package bit.javaoop;


import java.util.List;

public class FixedEmployeeNumberManager extends Manager {

    private int limitOfEmployees;
    private int spotsLeft;

    public FixedEmployeeNumberManager(String name, double salary, int limitOfEmployees,  List<AbstractEmployee> listOfEmployees) {
        super(name, salary,listOfEmployees);
        this.limitOfEmployees = limitOfEmployees;
        this.spotsLeft = limitOfEmployees;
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 20_000 && spotsLeft == 0;
    }

    @Override
    public boolean hire(AbstractEmployee employee) {
        if (spotsLeft > 0) {
            getListOfEmployees().add(employee);
            spotsLeft--;
            return true;
        } else {
            return false;
        }
    }
}

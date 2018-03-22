package bit.javaoop;


public class FixedEmployeeNumberMenager extends Menager{

    private int limitOfEmployees;
    private int spotsLeft;

    FixedEmployeeNumberMenager(String name, double salary, int limitOfEmployees) {
        super(name, salary);
        this.limitOfEmployees = limitOfEmployees;
        this.spotsLeft = limitOfEmployees;
    }

    @Override
    public boolean isSatisfied() {return getSalary()>20_000 && spotsLeft==0;}

    @Override
    public boolean hire(AbstractEmployee employee) {
        if (spotsLeft>0){
            getListOfEmployees().add(employee);
            spotsLeft--;
            return true;
        }else{
            return false;
        }
    }
}

package bit.javaoop;

public class Employee extends AbstractEmployee {

    public static final int SATYSFYING_SALARY = 10_000;

    public Employee(String name, double salary){ //konstruktor
        super(name, salary);
    }
    public boolean isSatisfied(){
        return getSalary() > SATYSFYING_SALARY; //mozna pisac podkreslniki
    }

}

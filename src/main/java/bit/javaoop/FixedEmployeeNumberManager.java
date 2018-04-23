package bit.javaoop;

public class FixedEmployeeNumberManager extends AbstractManager {


    private double employeesLimit;
    private double hiredEmployess;

    public FixedEmployeeNumberManager(String name, double salary, double employeesLimit) {
        super(name, salary,new ClassicalTaxTheft());
        this.employeesLimit = employeesLimit;
        this.hiredEmployess = 0;
    }

    @Override
    public boolean canHire(double salary) {
        return(employeesLimit>0);
    }

    @Override
    public void hire(String name, double salary) {
        if(this.canHire(salary)){
            employees.add(new Employee(name, salary));
            hiredEmployess++;
            System.out.println(name+" was successfully hired!");
        } else {
            System.out.println(name+" cannot be hired due to exceeded employees limit.");
        }

    }

    @Override
    public boolean isSatisfied() {

        return (getSalary()>20_000&&employeesLimit==0);

        return getSalary() > 20_000 && !canHireEmployees();

    }
}

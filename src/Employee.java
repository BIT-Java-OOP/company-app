package bit.javaoop;

public class Employee extends AbstractEmployee {


    public Employee(String name, double salary) {
        super(name, salary);
    }


    public boolean isSatisfied() {
        return this.getSalary() > 10000.0;
    }

    @Override
    public  String toString(){

        return this.getName()+ "  " + this.getSalary();
    }


}
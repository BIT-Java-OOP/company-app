package bit.javaoop;

public abstract class AbstractEmployee {
    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void getName(String name){
        this.name = name;
    }
}

package bit.javaoop;

public abstract class AbstractEmployee {
    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void answerBasicQuestions(){
        System.out.printf("My name is: %s%n", this.getName());
        System.out.printf("My salary is: %s%n", this.getSalary());
        System.out.printf("Am I satisfied?: %s%n", this.isSatisfied());
    }
}

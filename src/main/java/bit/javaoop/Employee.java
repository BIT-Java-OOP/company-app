package bit.javaoop;

public class Employee extends AbstractEmployee {


    private static final int SATISFYING_SALARY = 10_000;

    public Employee(String name, double salary) {
        super(name, salary);
    }

    public void answerQuestions() {
        System.out.println("What is your name?\n" + "My name is: " + this.getName() + "\n");
        System.out.println("What is your salary?\n" + "I earn: " + this.getSalary() + "\n");
        System.out.println("Are you satisfied?\n" + this.isSatisfied() + "\n");
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > SATISFYING_SALARY;
    }
}

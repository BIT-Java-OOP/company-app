package bit.javaoop;

public class EmployeeNumberManager extends Manager {

    EmployeeNumberManager(String name, double salary) {
        super(name, salary);
    }



    boolean isSatisfied(double salary, int spots) {
        return (salary > 20000 && spots == 0);
    }
}

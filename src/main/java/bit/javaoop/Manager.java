package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    static List<String> managers = new ArrayList<>();
    Manager(String name, double salary){
        super(name,salary);
        managers.add(name);
    }

   boolean isHire(String name, double salary)
    {
        int spots = 100;
        boolean question;
        if (spots > 0) {
            question = true;
            spots -= 1;
        } else {
            question = false;
        }

        return question;
    }

    void addEmployee(String name, double salary) {
        List lista = new ArrayList();
        if (isHire(name, salary) == true) {
            lista.add(name);
        }
    }

}

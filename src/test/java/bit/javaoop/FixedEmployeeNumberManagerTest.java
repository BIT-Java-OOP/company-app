package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FixedEmployeeNumberManagerTest {
    @Test
    void canHireEmployeeTest() {

        Manager manager1 = new FixedEmployeeNumberManager("Steve Jobs", 30_000, 2);
        manager1.hireEmployee(new Employee("Garek Majęcki", 60_000));

        Manager manager2 = new FixedEmployeeNumberManager("Bill Gates", 30_000, 1);
        manager2.hireEmployee(new Employee("Linus Torvalds", 0)); //He is an open source guy.

        boolean result1 = manager1.canHireEmployee(new Employee("Alan Turing", 100_000));
        boolean result2 = manager2.canHireEmployee(new Employee("Alan Turing", 100_000));

        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void hireEmployeeTest() {
        Manager fixedBudgetManager = new FixedEmployeeNumberManager("Steve Jobs", 30_000, 4);
        Employee bestEmployee = new Employee("Garek Majęcki", 60_000);

        fixedBudgetManager.hireEmployee(bestEmployee);
        LinkedList<Employee> employees = fixedBudgetManager.getEmployeeList();

        assertEquals(bestEmployee, employees.getFirst());
    }

    @Test
    void isSatisfied() {
        Manager manager1 = new FixedEmployeeNumberManager("Steve Jobs", 30_000, 2);
        manager1.hireEmployee(new Employee("Garek Majęcki", 60_000));
        manager1.hireEmployee(new Employee("Alan Turing", 10_000));

        Manager manager2 = new FixedEmployeeNumberManager("Bill Gates", 30_000, 2);
        manager2.hireEmployee(new Employee("Linus Torvalds", 0)); //He is an open source guy.

        boolean result1 = manager1.isSatisfied();
        boolean result2 = manager2.isSatisfied();

        assertTrue(result1);
        assertFalse(result2);
    }
}

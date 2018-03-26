package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void canHireonly2() {
        FixedEmployeeNumberManager manager=new FixedEmployeeNumberManager("Krzysiek", 15_000, 2);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Frodo", 5_000));
        manager.HireEmployee(new Employee("Mrodo", 5_000));
        manager.HireEmployee(new Employee("Drodo", 5_000));

        assertEquals(manager.listofEmployees.size(),2);
    }

    @Test
    void shouldBeSatisfied() {
        FixedEmployeeNumberManager manager=new FixedEmployeeNumberManager("Krzysiek", 25_000, 2);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Frodo", 5_000));
        manager.HireEmployee(new Employee("Mrodo", 5_000));

        boolean result = manager.isSatisfied();

        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfiedwithSalary()
    {
        FixedEmployeeNumberManager manager=new FixedEmployeeNumberManager("Krzysiek", 15_000, 2);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Frodo", 5_000));
        manager.HireEmployee(new Employee("Mrodo", 5_000));

        boolean result = manager.isSatisfied();

        assertFalse(result);
    }

    @Test
    void shouldNotBeSatisfiedwithBudget()
    {
        FixedEmployeeNumberManager manager=new FixedEmployeeNumberManager("Krzysiek", 25_000, 2);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Frodo", 5_000));

        boolean result = manager.isSatisfied();

        assertFalse(result);
    }
}
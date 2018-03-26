package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void canHireonly2() {
        FixedBudgetManager manager=new FixedBudgetManager("Maciek", 25_000, 10_000);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Wacek", 5_000));
        manager.HireEmployee(new Employee("Leszek", 4_000));
        manager.HireEmployee(new Employee("Michał", 5_000));

        assertEquals(manager.listofEmployees.size(),2);
    }

    @Test
    void shouldBeSatisfied() {
        FixedBudgetManager manager=new FixedBudgetManager("Maciek", 25_000, 20_000);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Wacek", 5_000));
        manager.HireEmployee(new Employee("Leszek", 4_000));

        boolean result = manager.isSatisfied();

        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfiedwithSalary()
    {
        FixedBudgetManager manager=new FixedBudgetManager("Maciek", 15_000, 20_000);
        manager.listofEmployees=new ArrayList<>();
        manager.HireEmployee(new Employee("Wacek", 5_000));
        manager.HireEmployee(new Employee("Leszek", 4_000));

        boolean result = manager.isSatisfied();

        assertFalse(result);
    }

    @Test
    void shouldNotBeSatisfiedwithBudget()
    {
        FixedBudgetManager manager=new FixedBudgetManager("Maciek", 25_000, 20_000);
        manager.listofEmployees=new ArrayList<>();

        boolean result = manager.isSatisfied();

        assertFalse(result);
    }
}
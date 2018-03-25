package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {
    @Test
    void canHire() {
        FixedBudgetManager manager = new FixedBudgetManager("Manager", 25_000, 30_000);
        Employee employee1 = new Employee("Employee 1", 15_000);
        Employee employee2 = new Employee("Employee 2", 40_000);

        boolean result1 = manager.canHire(employee1);
        boolean result2 = manager.canHire(employee2);

        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void hire() {
    }

    @Test
    void getBudget() {
        FixedBudgetManager manager = new FixedBudgetManager("Manager", 25_000, 30_000);

        assertEquals(30_000, manager.getBudget());
    }

    @Test
    void setBudget() {
        FixedBudgetManager manager = new FixedBudgetManager("Manager", 25_000, 30_000);
        manager.setBudget(50_000);

        assertEquals(50_000, manager.getBudget());
    }

    @Test
    void isSatisfied() {
        FixedBudgetManager manager1 = new FixedBudgetManager("Manager1", 25_000, 30_000);
        FixedBudgetManager manager2 = new FixedBudgetManager("Manager2", 15_000, 10_000);
        FixedBudgetManager manager3 = new FixedBudgetManager("Manager3", 25_000, 10_000);

        assertFalse(manager1.isSatisfied());
        assertFalse(manager2.isSatisfied());
        assertTrue(manager3.isSatisfied());
    }
}
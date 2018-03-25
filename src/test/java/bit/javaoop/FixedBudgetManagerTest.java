package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {
    @Test
    void isSatisfied() {
        FixedBudgetManager manager = new FixedBudgetManager("A", 200000.4, 10.1);
        assertTrue(manager.isSatisfied());
        manager.setBudget(19000.2);
        assertFalse(manager.isSatisfied());
        manager.setBudget(2.3);
        manager.setSalary(10.2);
        assertFalse(manager.isSatisfied());
    }

    @Test
    void canHireEmployee() {
        FixedBudgetManager manager = new FixedBudgetManager("A",200000.4,10.1);
        assertFalse(manager.canHireEmployee(new Employee("E",12)));
        assertTrue(manager.canHireEmployee(new Employee("E2",2)));

    }

}
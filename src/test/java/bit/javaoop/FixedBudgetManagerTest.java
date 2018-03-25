package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void isSatisfied_successfully() {
        FixedBudgetManager happy_manager = new FixedBudgetManager("Jan", 300_000);
        happy_manager.setFixedBudget(14_000);
        Employee employee = new Employee("Zbyszek", 10_000);
        happy_manager.hireNewEmployee(employee);
        boolean test_result = happy_manager.isSatisfied();
        assertTrue(test_result);
    }

    @Test
    void isSatisfied_fail() {
        FixedBudgetManager sad_manager = new FixedBudgetManager("Jan", 3_000);
        sad_manager.setFixedBudget(100_000);
        Employee employee = new Employee("Zbyszek", 10_000);
        sad_manager.hireNewEmployee(employee);
        boolean test_result = sad_manager.isSatisfied();
        assertFalse(test_result);
    }

    @Test
    void hireNewEmployee_successfully() {
        FixedBudgetManager manager = new FixedBudgetManager("Jan", 3_000);
        manager.setFixedBudget(100_000);
        Employee employee = new Employee("Zbyszek", 1_000);
        manager.hireNewEmployee(employee);
        assertTrue(manager.hireNewEmployee(employee));
    }

    @Test
    void hireNewEmployee_fail() {
        FixedBudgetManager manager = new FixedBudgetManager("Jan", 3_000);
        manager.setFixedBudget(10);
        Employee employee = new Employee("Zbyszek", 100_000);
        manager.hireNewEmployee(employee);
        assertFalse(manager.hireNewEmployee(employee));
    }
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedBudgetManagerTest {

    @Test
    void shouldBeSatisfiedWithHighSalaryAndLittleBudgetLeft(){
        // given
        FixedBudgetManager happy_manager = new FixedBudgetManager("Jan", 300_000);
        happy_manager.setFixedBudget(14_000);
        Employee employee = new Employee("Zbyszek", 10_000);
        happy_manager.hireNewEmployee(employee);
        // when
        boolean test_result = happy_manager.isSatisfied();
        // then
        assertTrue(test_result);
    }

    @Test
    void shouldNotBeSatisfiedWithLowSalaryAndMuchBudgetLeft() {
        // given
        FixedBudgetManager sad_manager = new FixedBudgetManager("Jan", 3_000);
        sad_manager.setFixedBudget(100_000);
        Employee employee = new Employee("Zbyszek", 10_000);
        sad_manager.hireNewEmployee(employee);
        // when
        boolean test_result = sad_manager.isSatisfied();
        // then
        assertFalse(test_result);
    }

    @Test
    void succeedInHiringNewEmployee() {
        // given
        FixedBudgetManager manager = new FixedBudgetManager("Jan", 3_000);
        manager.setFixedBudget(100_000);
        Employee employee = new Employee("Zbyszek", 1_000);
        // when
        boolean test_result =manager.hireNewEmployee(employee);
        // then
        assertTrue(test_result);
    }

    @Test
    void failedToHireNewEmployee() {
        // given
        FixedBudgetManager manager = new FixedBudgetManager("Jan", 3_000);
        manager.setFixedBudget(10);
        Employee employee = new Employee("Zbyszek", 100_000);
        // when
        boolean test_result =manager.hireNewEmployee(employee);
        // then
        assertFalse(test_result);
    }
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetManagerTest {

    @Test
    void shouldBeSatisfied() {
        Manager satisfiedManager = new BudgetManager("Marek", 25_000, 14_000);
        assertTrue(satisfiedManager.isSatisfied());
    }

    @Test
    void shouldBeNotSatisfied() {
        Manager tooMuchBudgetManager = new BudgetManager("Darek", 25_000, 16_000);
        Manager lowSalaryManager = new BudgetManager("Jarek", 20_000, 10_000);
        assertFalse(tooMuchBudgetManager.isSatisfied());
        assertFalse(lowSalaryManager.isSatisfied());
    }

    @Test
    void shouldHire() {
        Manager enoughBudgetManager = new BudgetManager("Darek", 25_000, 10_000);
        Employee employee = new Employee("Jarek", 10_000);
        assertTrue(enoughBudgetManager.canHire(employee));
    }

    @Test
    void shouldNotHire() {
        Manager noBudgetManager = new BudgetManager("Marek", 25_000, 0);
        Employee employee = new Employee("Jarek", 10_000);
        assertFalse(noBudgetManager.canHire(employee));
    }
}
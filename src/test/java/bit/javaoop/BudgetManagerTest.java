package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetManagerTest {

    @Test
    void isSatisfied() {
        BudgetManager satisfiedManager = new BudgetManager("Marek", 25_000, 14_000);
        BudgetManager tooMuchBudgetManager = new BudgetManager("Darek", 25_000, 16_000);
        BudgetManager lowSalaryManager = new BudgetManager("Jarek", 20_000, 10_000);

        assertTrue(satisfiedManager.isSatisfied());
        assertFalse(tooMuchBudgetManager.isSatisfied());
        assertFalse(lowSalaryManager.isSatisfied());
    }

    @Test
    void canHire() {
        BudgetManager noBudgetManager = new BudgetManager("Marek", 25_000, 0);
        BudgetManager enoughBudgetManager = new BudgetManager("Darek", 25_000, 10_000);
        Employee employee = new Employee("Jarek", 10_000);

        assertFalse(noBudgetManager.canHire(employee));
        assertTrue(enoughBudgetManager.canHire(employee));
    }

}
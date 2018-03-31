package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeNumberManagerTest {

    @Test
    void shouldBeSatisfied() {
        Manager satisfiedManager = new EmployeeNumberManager("Marek", 25_000, 0);
        assertTrue(satisfiedManager.isSatisfied());
    }

    @Test
    void shouldBeNotSatisfied() {
        Manager emptySpotManager = new EmployeeNumberManager("Darek", 25_000, 1);
        Manager lowSalaryManager = new EmployeeNumberManager("Jarek", 20_000, 0);
        assertFalse(emptySpotManager.isSatisfied());
        assertFalse(lowSalaryManager.isSatisfied());
    }

    @Test
    void shouldHire() {
        Manager freeSpotManager = new EmployeeNumberManager("Darek", 25_000, 1);
        Employee employee = new Employee("Jarek", 10_000);
        assertTrue(freeSpotManager.canHire(employee));
    }

    @Test
    void shouldNotHire() {
        Manager noSpotsManager = new EmployeeNumberManager("Marek", 25_000, 0);
        Employee employee = new Employee("Jarek", 10_000);
        assertFalse(noSpotsManager.canHire(employee));
    }
}
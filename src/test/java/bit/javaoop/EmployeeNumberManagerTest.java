package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeNumberManagerTest {

    @Test
    void isSatisfied() {
        EmployeeNumberManager satisfiedManager = new EmployeeNumberManager("Marek", 25_000, 0);
        EmployeeNumberManager emptySpotManager = new EmployeeNumberManager("Darek", 25_000, 1);
        EmployeeNumberManager lowSalaryManager = new EmployeeNumberManager("Jarek", 20_000, 0);

        assertTrue(satisfiedManager.isSatisfied());
        assertFalse(emptySpotManager.isSatisfied());
        assertFalse(lowSalaryManager.isSatisfied());
    }

    @Test
    void canHire() {
        EmployeeNumberManager noSpotsManager = new EmployeeNumberManager("Marek", 25_000, 0);
        EmployeeNumberManager freeSpotManager = new EmployeeNumberManager("Darek", 25_000, 1);
        Employee employee = new Employee("Jarek", 10_000);

        assertFalse(noSpotsManager.canHire(employee));
        assertTrue(freeSpotManager.canHire(employee));
    }
}
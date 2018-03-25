package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void getEmployeeLimit() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager", 25_000, 5);

        assertEquals(5, manager.getEmployeeLimit());
    }

    @Test
    void setEmployeeLimit() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager", 25_000, 5);
        manager.setEmployeeLimit(10);

        assertEquals(10, manager.getEmployeeLimit());
    }

    @Test
    void getHiredEmployees() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager", 25_000, 5);
        Employee employee1 = new Employee("Employee 1", 10_000);
        Employee employee2 = new Employee("Employee 2", 10_000);

        int numberBeforeHire = manager.getHiredEmployees();
        manager.hire(employee1);
        manager.hire(employee2);
        int numberAfterHire = manager.getHiredEmployees();

        assertEquals(0, numberBeforeHire);
        assertEquals(2, numberAfterHire);
    }

    @Test
    void setHiredEmployees() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager", 25_000, 5);
        manager.setHiredEmployees(4);

        assertEquals(4, manager.getHiredEmployees());
    }

    @Test
    void canHire() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager", 25_000, 5);
        Employee employee = new Employee("Employee", 10_000);

        boolean result1 = manager.canHire(employee);
        manager.setHiredEmployees(5);
        boolean result2 = manager.canHire(employee);

        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void isSatisfied() {
        FixedEmployeeNumberManager manager1 = new FixedEmployeeNumberManager("Manager 1", 25_000, 5);
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("Manager 2", 5_000, 0);
        FixedEmployeeNumberManager manager3 = new FixedEmployeeNumberManager("Manager 3", 25_000, 0);

        assertFalse(manager1.isSatisfied());
        assertFalse(manager2.isSatisfied());
        assertTrue(manager3.isSatisfied());
    }
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedEmployeeManagerTest {

    @Test
    void canHireEmployee() {
        AbstractManager manager = new FixedEmployeeManager("Zenek", 20_000, 1);
        AbstractEmployee employee = new Employee("Abcd", 2000);
        assertTrue(manager.canHireEmployee(employee), "hiring 1st employee failed");
        manager.hireEmployee(employee);
        AbstractEmployee employee1 = new Employee("Efgh", 1000);
        assertFalse(manager.canHireEmployee(employee1), "hiring 2nd employee failed");
    }
}
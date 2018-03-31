package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void isSatisfied() {
        Employee richEmployee = new Employee("Marek", 50_000);
        Employee poorEmployee = new Employee("Tomek", 8_000);

        assertTrue(richEmployee.isSatisfied());
        assertFalse(poorEmployee.isSatisfied());
    }
}
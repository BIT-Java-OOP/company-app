package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EmployeeTest {

    @Test
    void shouldBeSatisfied() {
        Employee highSalaryEmployee = new Employee("", 50_000);
        Employee lowSalaryEmployee = new Employee("", 2_000);

        assertTrue(highSalaryEmployee.isSatisfied());
        assertFalse(lowSalaryEmployee.isSatisfied());
    }
}
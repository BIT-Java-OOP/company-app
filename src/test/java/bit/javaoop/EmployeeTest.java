package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldBeSatisfied() {
        //given
        Employee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000);
        Employee lowSalaryEmployee = new Employee("Nie pracownik", 1_000);

        //when
        boolean resultHigh = highSalaryEmployee.isSatisfied();
        boolean resultLow = lowSalaryEmployee.isSatisfied();

        //then
        assertTrue(resultHigh);
        assertFalse(resultLow);

    }
}
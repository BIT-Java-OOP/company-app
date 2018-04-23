package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void shouldBeSatisfied() {
        //given
        Employee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000);
        //when
        boolean result = highSalaryEmployee.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test

    void shouldNotBeSatisfied() {
        //given
        Employee lowSalaryEmployee = new Employee("Biedny pracownik", 10_000);
        //when
        boolean result = lowSalaryEmployee.isSatisfied();
        //then

        assertFalse(result);
    }
}
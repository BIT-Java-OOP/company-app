package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @BeforeEach
    void setUp() {

    }

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
        Employee lowSalaryEmployee = new Employee("Bogaty pracownik", 10_000);
        //when
        boolean result = lowSalaryEmployee.isSatisfied();
        //then
        assertFalse(result);
    }

}
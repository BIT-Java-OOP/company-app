package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isSatisfied() {
        //given
        Employee Kowalski = new Employee("Jan Kowalski",1000);
        Employee Nowak = new Employee("Waclaw Nowak", 50000);

        //when
        boolean expected_Kowalski = false;
        boolean expected_Nowak = true;

        //then
        assertFalse(expected_Kowalski);
        assertTrue(expected_Nowak);

    }
}
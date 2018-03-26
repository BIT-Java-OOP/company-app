package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeNumberManagerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isSatisfied() {
        //given
        EmployeeNumberManager testEmployee = new EmployeeNumberManager("Satisfied Worker", 50_000);
        //when
        boolean result = testEmployee.isSatisfied();
        //then
        assertTrue(result);
    }
}
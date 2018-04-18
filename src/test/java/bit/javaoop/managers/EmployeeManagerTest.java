package bit.javaoop.managers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeManagerTest {
    @Test
    void isSatisfied() {
        //given
        EmployeeManager manager = new EmployeeManager("Leo", 55000, 0);
        //when
        boolean result = manager.isSatisfied();
        //then
        assertTrue(result);
    }

}
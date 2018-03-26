package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    void nameShouldBeIvan() {
        Employee ivan = new Employee("Ivan", 10000);
        assertEquals(ivan.getName(), "Ivan");
    }
}
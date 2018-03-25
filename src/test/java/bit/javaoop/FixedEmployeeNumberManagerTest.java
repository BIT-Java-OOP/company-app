package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FixedEmployeeNumberManagerTest {
    Employee employee_1 = new Employee("Pracownik_1", 10_000);
    Employee employee_2 = new Employee("Pracownik_2", 15_000);
    Employee employee_3 = new Employee("Pracownik_3", 20_000);

    @Test
    void shouldHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, 2);
        //when
        boolean result = manager.hire(employee_1) && manager.hire(employee_2);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, 2);
        //when
        boolean result = manager.hire(employee_1) && manager.hire(employee_2) && manager.hire(employee_3);
        //then
        assertFalse(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, 2);
        manager.hire(employee_1);
        manager.hire(employee_2);
        //when
        boolean result = manager.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfied() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, 2);
        //when
        boolean result = !manager.isSatisfied();
        //then
        assertTrue(result);
    }
}

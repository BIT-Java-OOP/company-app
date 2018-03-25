package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedEmployeeNumberManagerTest {


    @Test
    void isSatisfied_successfully() {
        FixedEmployeeNumberManager happy_manager = new FixedEmployeeNumberManager("Jan", 300_000);
        happy_manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        happy_manager.hireNewEmployee(employee);
        boolean test_result = happy_manager.isSatisfied();
        assertTrue(test_result);
    }

    @Test
    void isSatisfied_fail() {
        FixedEmployeeNumberManager sad_manager = new FixedEmployeeNumberManager("Jan", 3_000);
        sad_manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        sad_manager.hireNewEmployee(employee);
        boolean test_result = sad_manager.isSatisfied();
        assertFalse(test_result);
    }

    @Test
    void hireNewEmployee_successfully() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Jan", 3_000);
        manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        manager.hireNewEmployee(employee);
        assertTrue(manager.hireNewEmployee(employee));
    }

    @Test
    void hireNewEmployee_fail() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Jan", 3_000);
        manager.setEmployeeLimit(0);
        Employee employee = new Employee("Zbyszek", 100_000);
        manager.hireNewEmployee(employee);
        assertFalse(manager.hireNewEmployee(employee));
    }
}
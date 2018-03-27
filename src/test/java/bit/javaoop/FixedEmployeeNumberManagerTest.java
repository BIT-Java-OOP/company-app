package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedEmployeeNumberManagerTest {


    @Test
    void shouldBeSatisfiedWithHighSalaryAndNoVacancyLeft() {
        FixedEmployeeNumberManager happy_manager = new FixedEmployeeNumberManager("Jan", 300_000);
        happy_manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        happy_manager.hireNewEmployee(employee);
        boolean test_result = happy_manager.isSatisfied();
        assertTrue(test_result);
    }

    @Test
    void shouldNotBeSatisfiedWithLowSalaryAndNoVacancyLeft() {
        FixedEmployeeNumberManager sad_manager = new FixedEmployeeNumberManager("Jan", 3_000);
        sad_manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        sad_manager.hireNewEmployee(employee);
        boolean test_result = sad_manager.isSatisfied();
        assertFalse(test_result);
    }

    @Test
    void succeedInHiringNewEmployee() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Jan", 3_000);
        manager.setEmployeeLimit(1);
        Employee employee = new Employee("Zbyszek", 100_000);
        manager.hireNewEmployee(employee);
        assertTrue(manager.hireNewEmployee(employee));
    }

    @Test
    void failedToHireNewEmployee() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Jan", 3_000);
        manager.setEmployeeLimit(0);
        Employee employee = new Employee("Zbyszek", 100_000);
        manager.hireNewEmployee(employee);
        assertFalse(manager.hireNewEmployee(employee));
    }
}
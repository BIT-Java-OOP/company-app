package bit.javaoop;

import bit.javaoop.employeesPackage.Employee;
import org.junit.jupiter.api.Test;

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
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void isSatisfiedTest() {

        Employee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000);

        boolean result = highSalaryEmployee.isSatisfied();

        assertTrue(result);
    }

    @Test
    void getSalaryTest() {

        Employee ordinaryEmployee = new Employee("Zbigniew Stonoga", 20_000);

        double salary = ordinaryEmployee.getSalary();

        assertEquals(20_000, salary);
    }

    @Test
    void setSalaryTest() {

        Employee ordinaryEmployee = new Employee("Zbigniew Stonoga", 20_000);

        ordinaryEmployee.setSalary(10_000);
        double salary = ordinaryEmployee.getSalary();

        assertEquals(10_000, salary);
    }

    @Test
    void toStringTest() {

        Employee ordinaryEmployee = new Employee("Zbigniew Stonoga", 20_000);

        String string = ordinaryEmployee.toString();

        assertEquals("Zbigniew Stonoga - Employee", string);
    }
}
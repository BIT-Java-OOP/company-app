package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void shouldBeSaisfied(){
        AbstractEmployee employee = new Employee("Stefan",25_000);
        assertTrue(employee.isSatisfied());
    }
    @Test
    void shouldNotBeSaitisfied(){
        AbstractEmployee employee = new Employee("kek",8_000);
        assertFalse(employee.isSatisfied());
    }
    @Test
    void checkName(){
        AbstractEmployee employee = new Employee("maciek", 2_000);
        assertTrue(employee.getName().equals("maciek"));
    }
    @Test
    void checkSalary(){
        AbstractEmployee employee = new Employee("maciek", 2_000);
        assertTrue(employee.getSalary() == 2_000);
    }

}
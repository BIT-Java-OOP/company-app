package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void ShouldBeTrue(){
        AbstractEmployee employee = new Employee("Stefan",25_000);
        assertTrue(employee.isSatisfied());
    }
    @Test
    void ShouldBeFalse(){
        AbstractEmployee employee = new Employee("kek",8_000);
        assertFalse(employee.isSatisfied());
    }
    @Test
    void CheckName(){
        AbstractEmployee employee = new Employee("maciek", 2_000);
        assertTrue(employee.getName() == "maciek");
    }
    @Test
    void CheckSalary(){
        AbstractEmployee employee = new Employee("maciek", 2_000);
        assertTrue(employee.getSalary() == 2_000);
    }

}
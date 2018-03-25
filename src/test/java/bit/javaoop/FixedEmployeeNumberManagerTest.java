package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {
    @Test
    void isSatisfied() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("A", 200000.4, 3);
        assertFalse(manager.isSatisfied());
        manager.setLimit(0);
        assertTrue(manager.isSatisfied());
        manager.setLimit(2);
        manager.hireEmployee(new Employee("Jan", 12));
        assertFalse(manager.isSatisfied());
        manager.hireEmployee(new Employee("Ina", 12));
        assertTrue(manager.isSatisfied());
        manager.setSalary(10.2);
        assertFalse(manager.isSatisfied());

    }

    @Test
    void canHireEmployee() {
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("A", 200000.4, 3);
        Employee emp = new Employee("Jan", 12);
        assertTrue(manager.canHireEmployee(emp));
        manager.hireEmployee(emp);
        assertTrue(manager.canHireEmployee(emp));
        manager.hireEmployee(emp);
        assertTrue(manager.canHireEmployee(emp));
        manager.setLimit(2);
        assertFalse(manager.canHireEmployee(emp));


    }

}
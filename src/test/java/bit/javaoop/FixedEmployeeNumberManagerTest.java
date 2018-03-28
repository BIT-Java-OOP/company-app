package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedEmployeeNumberManagerTest {
    private FixedEmployeeNumberManager manager;

    @BeforeEach
    void setUp() {
        manager = new FixedEmployeeNumberManager("A", 200000.4, 3);

    }

    @Test
    void shouldTellIfIsSatisfied() {
        //given
        //then
        assertFalse(manager.isSatisfied());
        //when
        manager.setLimit(0);
        //then
        assertTrue(manager.isSatisfied());
        //when
        manager.setLimit(2);
        manager.hireEmployeeIfPossible(new Employee("Jan", 12));
        //then
        assertFalse(manager.isSatisfied());
        //when
        manager.hireEmployeeIfPossible(new Employee("Ina", 12));
        //tehn
        assertTrue(manager.isSatisfied());
        //when
        manager.setSalary(10.2);
        //then
        assertFalse(manager.isSatisfied());

    }

    @Test
    void shuldCheckIfCanHireEmployee() {
        //given
        Employee emp = new Employee("Jan", 12);
        //then
        assertTrue(manager.canHireEmployee(emp));
        //when
        manager.hireEmployeeIfPossible(emp);
        //then
        assertTrue(manager.canHireEmployee(emp));
        //when
        manager.hireEmployeeIfPossible(emp);
        //then
        assertTrue(manager.canHireEmployee(emp));
        //when
        manager.setLimit(2);
        //then
        assertFalse(manager.canHireEmployee(emp));
    }

}
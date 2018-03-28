package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {
    @Test
    void shouldTellIfIsSatisfied() {
        //given
        FixedBudgetManager manager = new FixedBudgetManager("A", 200000.4, 10.1);
        //then
        assertTrue(manager.isSatisfied());
        //when
        manager.setBudget(19000.2);
        //then
        assertFalse(manager.isSatisfied());
        //when
        manager.setBudget(2.3);
        manager.setSalary(10.2);
        //then
        assertFalse(manager.isSatisfied());
    }

    @Test
    void shuldCheckIfCanHireEmployee() {
        //given
        FixedBudgetManager manager = new FixedBudgetManager("A",200000.4,10.1);
        //then
        assertFalse(manager.canHireEmployee(new Employee("E",12)));
        assertTrue(manager.canHireEmployee(new Employee("E2",2)));

    }

}
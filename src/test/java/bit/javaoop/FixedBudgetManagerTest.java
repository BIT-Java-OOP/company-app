package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {
    private FixedBudgetManager manager;

    @BeforeEach
    void setUp() {
        manager = new FixedBudgetManager("A", 200000.4, 10.1);

    }

    @Test
    void shouldTellIfIsSatisfied() {
        //given

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

        //then
        assertFalse(manager.canHireEmployee(new Employee("E", 12)));
        assertTrue(manager.canHireEmployee(new Employee("E2", 2)));

    }

}
package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedBudgetManagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldBeSatisfied() {
        //given
        Manager highSalaryManager = new FixedBudgetManager("Bogaty pan Manager", 50_000, 10_000,new LinkedList<>());
        //when
        boolean result = highSalaryManager.isSatisfied();
        //then
        assertTrue(result);

    }

    @Test
    void shouldBeHired() {
        //given
        Manager managerWhoHiresEmployees = new FixedBudgetManager("Pan Manager", 50_000, 5_000,new LinkedList<>());
        AbstractEmployee personWhoWantsToGetAJob = new Employee("Pan Mietek", 2_000);
        //when
        boolean isMietekHired = managerWhoHiresEmployees.hire(personWhoWantsToGetAJob);
        //then
        assertTrue(isMietekHired);
    }

}
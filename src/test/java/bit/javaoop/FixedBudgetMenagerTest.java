package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetMenagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void isSatisfied() {
        //given
        Menager highSalaryMenager = new FixedBudgetMenager("Bogaty pan menager", 50_000,10_000);
        //when
        boolean result = highSalaryMenager.isSatisfied();
        //then
        assertTrue(result);

    }

    @Test
    void hire() {
        //given
        Menager menagerWhoHiresEmployees = new FixedBudgetMenager("Pan Menager",50_000,5_000);
        AbstractEmployee personWhoWantsToGetAJob = new Employee("Pan Mietek",2_000);
        //when
        boolean isMietekHired = menagerWhoHiresEmployees.hire(personWhoWantsToGetAJob);
        //then
        assertTrue(isMietekHired);
    }

}
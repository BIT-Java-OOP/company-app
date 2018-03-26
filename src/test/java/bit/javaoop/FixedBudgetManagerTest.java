package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void isSatisfied() {
        //given
        AbstractEmployee fixedBudgetManager=new FixedBudgetManager("Antek", 25_000f);
        //when
        boolean satisfied=fixedBudgetManager.isSatisfied();
        //then
        assertTrue(satisfied);
    }
}
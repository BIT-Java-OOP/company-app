package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {


    @Test
    void shouldBeSatisfied() {
        //given
        FixedBudgetManager Bob = new FixedBudgetManager("Bob",21_000,10_000);
        //when
        boolean result=Bob.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void shouldBeAbleToHire() {
        //given
        FixedBudgetManager Bob = new FixedBudgetManager("Bob",13_000,10_000);
        //when
        boolean result=Bob.canHire(3_000);
        //then
        assertTrue(result);
    }

}
package bit.javaoop.managers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BudgetManagerTest {

    @Test
    void shouldBeHired() {
        //given
        BudgetManager manager = new BudgetManager("Hojny manadżer", 45000, 400000);
        //when
        boolean result = manager.canHireEmployee();
        //then
        assertTrue(result);
    }

}
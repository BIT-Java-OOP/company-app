package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CEOTest {
    @Test
    void shouldHireManagerIfPossible() {
        //given
        CEO ceo = new CEO("Adam");
        Manager manager = new FixedEmployeeNumberManager("One", 1200, 12);
        //when
        ceo.hireManager(manager);
        ceo.hireManager(new FixedBudgetManager("Two", 10, 100));
        //then
        assertEquals(2, ceo.getManagersList().size());
        assertEquals("One", ceo.getManagersList().get(0).getName());
        assertEquals("Two", ceo.getManagersList().get(1).getName());

    }

    @Test
    void shouldDoToString() {
        //given
        CEO ceo = new CEO("Adam");
        //then
        assertEquals(ceo.getName() + " - CEO", ceo.toString());
        //when
        Manager manager = new FixedEmployeeNumberManager("One", 1200, 12);
        //then
        ceo.hireManager(manager);
    }

}
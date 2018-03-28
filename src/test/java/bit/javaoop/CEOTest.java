package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CEOTest {
    @Test
    void shouldHireManagerIfPossible() {
        CEO ceo = new CEO("Adam");
        Manager manager = new FixedEmployeeNumberManager("One", 1200, 12);
        ceo.hireManager(manager);
        ceo.hireManager(new FixedBudgetManager("Two", 10, 100));
        assertEquals(2, ceo.getManagersList().size());
        assertEquals("One", ceo.getManagersList().get(0).getName());
        assertEquals("Two", ceo.getManagersList().get(1).getName());

    }

    @Test
    void tostring() {
        CEO ceo = new CEO("Adam");
        assertEquals(ceo.getName() + " - CEO", ceo.toString());
        Manager manager = new FixedEmployeeNumberManager("One", 1200, 12);
        ceo.hireManager(manager);
    }

}
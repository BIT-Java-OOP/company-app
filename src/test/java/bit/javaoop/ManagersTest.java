package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ManagersTest {

    @Test
    void shouldBeAbleToHireWithHighBudget() {
        FixedBudgetManager m1 = new FixedBudgetManager("A", 30000);
        m1.setBudget(40000);
        Employee e1 = new Employee("B", 3000);
        Employee e2 = new Employee("C", 4000);

        assertTrue(m1.canHire(e1));
        m1.hire(e1);
        assertTrue(m1.canHire(e2));
    }

    @Test
    void shouldBeAbleToHireWithHighLimit() {
        FixedEmploeeNumberManager m1 = new FixedEmploeeNumberManager("A", 30000);
        m1.setEmployeeLimit(8);
        Employee e1 = new Employee("B", 3000);
        Employee e2 = new Employee("C", 4000);

        assertTrue(m1.canHire(e1));
        m1.hire(e1);
        assertTrue(m1.canHire(e2));
    }

    @Test
    void cantHireOnLowBudget() {
        FixedBudgetManager m1 = new FixedBudgetManager("A", 30000);
        m1.setBudget(400);
        Employee e1 = new Employee("B", 3000);
        assertFalse(m1.canHire(e1));
    }

    @Test
    void cantHireWhenRunsOutOfLimit() {
        FixedEmploeeNumberManager m1 = new FixedEmploeeNumberManager("A", 30000);
        m1.setEmployeeLimit(4);
        Employee e1 = new Employee("B", 3000);
        Employee e2 = new Employee("B", 3000);
        Employee e3 = new Employee("B", 3000);
        Employee e4 = new Employee("B", 3000);
        Employee e5 = new Employee("B", 3000);

        assertTrue(m1.canHire(e1));
        m1.hire(e1);
        assertTrue(m1.canHire(e2));
        m1.hire(e2);
        assertTrue(m1.canHire(e3));
        m1.hire(e3);
        assertTrue(m1.canHire(e4));
        m1.hire(e4);
        assertFalse(m1.canHire(e5));
    }

    @Test
    void cantHireWhenRunsOutOfBudget() {
        FixedBudgetManager m1 = new FixedBudgetManager("A", 30000);
        m1.setBudget(40000);
        Employee e1 = new Employee("B", 30000);
        Employee e2 = new Employee("C", 6000);
        Employee e3 = new Employee("D", 7000);

        assertTrue(m1.canHire(e1));
        m1.hire(e1);
        assertTrue(m1.canHire(e2));
        m1.hire(e2);
        assertFalse(m1.canHire(e3));
    }

}

package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractManagerTest {

    @Test
    void canHire() {
        AbstractManager m1 = new FixedBudgetManager("David Hilbert", 20_000,30_000);
        AbstractManager m2 = new FixedEmployeesManager("Henri Poincare", 20_000,1);
        AbstractEmployee e1 = new Employee("Mikhail Gromov",40000);
        AbstractEmployee e2 = new Employee("Grigori Perelman",15000);

        assertEquals(false,m1.canHire(e1));
        assertEquals(true,m1.canHire(e2));
        assertEquals(true,m2.canHire(e1));
        m2.hire(e2);
        assertEquals(false,m1.canHire(e1));
    }

    @Test
    void hire() {
        AbstractManager m1 = new FixedBudgetManager("David Hilbert", 20_000,30_000);
        AbstractManager m2 = new FixedEmployeesManager("Henri Poincare", 20_000,1);
        AbstractEmployee e1 = new Employee("Mikhail Gromov",40000);
        AbstractEmployee e2 = new Employee("Grigori Perelman",15000);
        m1.hire(e1);
        assertEquals(0,m1.getSubordinates().size());
        m1.hire(e2);
        assertEquals(1,m1.getSubordinates().size());
        m2.hire(e1);
        assertEquals(1,m2.getSubordinates().size());
    }
}
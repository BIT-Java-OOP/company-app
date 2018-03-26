package bit.javaoop;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    ArrayList<AbstractEmployee> list;
    AbstractEmployee worker1 = new Employee("", 9_000);
    AbstractEmployee worker2 = new Employee("", 12_000);
    AbstractEmployee worker3 = new Employee("", 11_000);


    @BeforeEach
    void setUp() {
        list = new ArrayList<AbstractEmployee>();

    }

    @Test
    void shouldBeSatisfied() {
        FixedEmployeeNumberManager manager1 = new FixedEmployeeNumberManager("", 21_000, 3, list);
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("", 19_000, 1, list);
        FixedEmployeeNumberManager manager3 = new FixedEmployeeNumberManager("", 19_000, 5, list);

        manager1.hire(worker1);
        manager1.hire(worker2);
        manager1.hire(worker3);
        manager2.hire(worker1);
        manager3.hire(worker2);
        manager3.hire(worker3);

        assertTrue(manager1.isSatisfied());
        assertFalse(manager2.isSatisfied());
        assertFalse(manager3.isSatisfied());

    }

    @Test
    void shouldHire() {
        FixedEmployeeNumberManager manager1 = new FixedEmployeeNumberManager("", 21_000, 3, list);
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("", 19_000, 12, list);

        manager1.hire(worker1);
        manager1.hire(worker2);
        manager1.hire(worker3);
        manager2.hire(worker1);

        assertFalse(manager1.canHire());
        assertTrue(manager2.canHire());

    }

}
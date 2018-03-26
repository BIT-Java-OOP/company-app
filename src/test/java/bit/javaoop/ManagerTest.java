package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isSatisfied() {
        Manager manager= new Manager("",20_001,30_000,4);
        manager.hire(new Employee("",4_000));
        manager.hire(new Employee("",4_000));
        manager.hire(new Employee("",4_000));
        assertFalse(manager.isSatisfied());
        manager.hire(new Employee("",4_000));
        assertFalse(manager.canHire(new Employee("",4_000)));
        assertTrue(manager.isSatisfied());
    }
}
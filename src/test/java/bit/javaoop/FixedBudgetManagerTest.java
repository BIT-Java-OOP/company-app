package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    private AbstractManager manager;
    private AbstractEmployee employee;

    @BeforeEach
    void setUp(){
        manager = new FixedBudgetManager("Jacek",21_000, 100_000);
        AbstractEmployee employee2 = new Employee("pierwszy", 30_000);
        employee = new Employee ("drugi", 20_000);
        manager.hire(employee2);
    }

    @Test
    void shouldBeSatisfied(){
        AbstractEmployee employee2 = new Employee("drugi ", 60_000);
        manager.hire(employee2);

        assertTrue(manager.isSatisfied());
    }

    @Test
    void shouldNotBeSatisfied(){
        manager.hire(employee);

        assertFalse(manager.isSatisfied());
    }
    @Test
    void shouldNotHire(){
        AbstractEmployee employee3 = new Employee("trzeci", 20_001);
        manager.hire(employee);

        assertFalse(manager.canHire(employee3));
    }

    @Test
    void shouldHire(){
        assertTrue(manager.canHire(employee));
    }
}
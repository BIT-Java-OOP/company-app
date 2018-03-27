package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    private AbstractManager manager;

    @BeforeEach
    void setUp(){
        manager = new FixedEmployeeNumberManager("Macko",25_000, 2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        manager.hire(employee);
    }

    @Test
    void shouldBeSatisfied() {
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        manager.hire(employee2);

        assertTrue(manager.isSatisfied());
    }

    @Test
    void shouldNotBeSatisfied(){
        assertFalse(manager.isSatisfied());
    }


    @Test
    void shouldNotHire(){
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        AbstractEmployee employee3 = new Employee("Robak3", 10_000);
        manager.hire(employee2);

        assertFalse(manager.canHire(employee3));
    }
    @Test
    void shouldHire(){
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        assertTrue(manager.canHire(employee2));
    }

}
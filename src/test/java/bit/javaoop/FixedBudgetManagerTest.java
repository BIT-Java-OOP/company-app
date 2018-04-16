package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    private AbstractManager manager;
    private AbstractEmployee employee;

    @BeforeEach
    void setUp(){
        manager = new FixedBudgetManager("Jacek",21_000,new NiceSalaryCalculator(), new NormalEmploymentPolicy(), 100_000);
        AbstractEmployee employee2 = new Employee("pierwszy", 30_000, new NiceSalaryCalculator(), new B2BEmploymentPolicy());
        employee = new Employee ("drugi", 20_000,new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        manager.hire(employee2);
    }

    @Test
    void shouldBeSatisfied(){
        //given
        AbstractEmployee employee2 = new Employee("drugi ", 60_000, new NiceSalaryCalculator(), new NormalEmploymentPolicy());

        //when
        manager.hire(employee2);

        //then
        assertTrue(manager.isSatisfied());
    }

    @Test
    void shouldNotBeSatisfied(){
        //when
        manager.hire(employee);

        //then
        assertFalse(manager.isSatisfied());
    }
    @Test
    void shouldNotHire(){
        //given
        AbstractEmployee employee3 = new Employee("trzeci", 20_001, new NiceSalaryCalculator(), new B2BEmploymentPolicy());

        //when
        manager.hire(employee);

        //then
        assertFalse(manager.canHire(employee3));
    }

    @Test
    void shouldHire(){
        assertTrue(manager.canHire(employee));
    }
}
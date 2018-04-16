package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    private AbstractManager manager;

    @BeforeEach
    void setUp(){
        manager = new FixedEmployeeNumberManager("Macko",25_000, new NiceSalaryCalculator(),new NormalEmploymentPolicy(),2);
        AbstractEmployee employee = new Employee("Robak1", 10_000, new NiceSalaryCalculator(), new B2BEmploymentPolicy());
        manager.hire(employee);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        AbstractEmployee employee2 = new Employee("Robak2", 10_000, new NiceSalaryCalculator(), new NormalEmploymentPolicy());

        //when
        manager.hire(employee2);

        //then
        assertTrue(manager.isSatisfied());
    }

    @Test
    void shouldNotBeSatisfied(){
        assertFalse(manager.isSatisfied());
    }


    @Test
    void shouldNotHire(){
        //given
        AbstractEmployee employee2 = new Employee("Robak2", 10_000,new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        AbstractEmployee employee3 = new Employee("Robak3", 10_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());

        //when
        manager.hire(employee2);

        //then
        assertFalse(manager.canHire(employee3));
    }
    @Test
    void shouldHire(){
        //given
        AbstractEmployee employee2 = new Employee("Robak2", 10_000, new WorstSalaryCalculator(), new B2BEmploymentPolicy());

        //then
        assertTrue(manager.canHire(employee2));
    }

}
package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberMenagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldBeSatisfied() {
        //given
        Manager highSalaryManager = new FixedEmployeeNumberManager("Bogaty pan manager", 50_000,0,new LinkedList<>());
        //when
        boolean result = highSalaryManager.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void hire() {
        //given
        Manager highSalaryMenager = new FixedEmployeeNumberManager("Pan Manager", 50_000,10,new LinkedList<>());
        AbstractEmployee giveMeAJob = new Employee("Gosia",3_000);
        //when
        boolean result = highSalaryMenager.hire(giveMeAJob);
        //then
        assertTrue(result);
    }

}
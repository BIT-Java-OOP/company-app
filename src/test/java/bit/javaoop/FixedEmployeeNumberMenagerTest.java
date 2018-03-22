package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberMenagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void isSatisfied() {
        //given
        Menager highSalaryMenager = new FixedEmployeeNumberMenager("Bogaty pan menager", 50_000,0);
        //when
        boolean result = highSalaryMenager.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void hire() {
        //given
        Menager highSalaryMenager = new FixedEmployeeNumberMenager("Pan Menager", 50_000,10);
        AbstractEmployee giveMeAJob = new Employee("Gosia",3_000);
        //when
        boolean result = highSalaryMenager.hire(giveMeAJob);
        //then
        assertTrue(result);
    }

}
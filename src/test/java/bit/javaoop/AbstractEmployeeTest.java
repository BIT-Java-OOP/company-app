package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractEmployeeTest {

    @Test
    void isSatisfied() {
        //given
        AbstractEmployee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000);
        //when
        boolean result = highSalaryEmployee.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void getName() {
        //given
        AbstractEmployee nameBobEmployee = new Employee("Bob", 1);
        //when
        String result = nameBobEmployee.getName();
        //then
        assertEquals("Bob",result);
    }

    @Test
    void setName() {
        //given
        AbstractEmployee nameBobEmployee = new Employee("NewBob", 1);
        //when
        nameBobEmployee.setName("NewBob");
        String result = nameBobEmployee.getName();
        //then
        assertEquals("NewBob",result);
    }


}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @Test
    void shouldBePaidAsRegularEmployee() {
        //given
        Employee Zbysiu = new Employee("Zbysiu",10000);
        //when
        boolean paidProperly=(Zbysiu.getSalary()==0.85*10000);
        //then
        assertTrue(paidProperly);
    }
    @Test
    void shouldBePaidAsManager() {
        //given
        FixedBudgetManager Zbysiu = new FixedBudgetManager("Zbysiu",20000,15000);
        //when
        boolean paidProperly=(Zbysiu.getSalary()==0.66*20000);
        //then
        assertTrue(paidProperly);
    }
    @Test
    void shouldBePaidAsCEO() {
        //given
        CEO Zbysiu = new CEO("Zbysiu",70000);
        //when
        boolean paidProperly=(Zbysiu.getSalary()==1.25*70000);
        //then
        assertTrue(paidProperly);
    }
}
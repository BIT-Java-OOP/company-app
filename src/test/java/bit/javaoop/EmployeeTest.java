package bit.javaoop;

import bit.javaoop.calculator.GrossSalaryCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.employment.B2B;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldBeSatisfied() {
        //given
        AbstractEmployee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000,new GrossSalaryCalculator(),new B2B());

        //when
        boolean result = highSalaryEmployee.isSatisfied();

        //then
        assertTrue(result);
    }


    @Test
    void shouldNotBeSatisfied(){
        //given
        AbstractEmployee highSalaryEmployee = new Employee("Biedny pracownik", 3_000,new GrossSalaryCalculator(),new B2B());

        //when
        boolean result = highSalaryEmployee.isSatisfied();

        //then
        assertTrue(!result);
    }


    
}

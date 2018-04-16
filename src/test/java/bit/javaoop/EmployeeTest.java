package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    final double NICE_SALARY = 10_000;
    final double WORST_SALARY = 5_000;
    @BeforeEach
    void setUp() {

    }
    @Test
    void shouldBeSaisfied(){
        //given
        AbstractEmployee employee = new Employee("Stefan",NICE_SALARY, new WorstSalaryCalculator(), new B2BEmploymentPolicy());
        //then
        assertFalse(employee.isSatisfied());
    }
    @Test
    void shouldNotBeSaitisfied(){
        //given
        AbstractEmployee employee = new Employee("kek",NICE_SALARY, new NiceSalaryCalculator(), new NormalEmploymentPolicy());
        //then
        assertFalse(employee.isSatisfied());
    }
    @Test
    void shouldDecreaseSalary(){
        //given
        AbstractEmployee employee = new Employee("kek",NICE_SALARY, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        //then
        assertTrue(employee.getActualSalary(employee.getSalary()) == WORST_SALARY);

    }
    @Test
    void checkName(){
        //given
        AbstractEmployee employee = new Employee("maciek", 2_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        //then
        assertTrue(employee.getName().equals("maciek"));
    }
    @Test
    void checkSalary(){
        //given
        AbstractEmployee employee = new Employee("maciek", 2_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        //then
        assertTrue(employee.getActualSalary(employee.getSalary()) == 1_000);
    }

}
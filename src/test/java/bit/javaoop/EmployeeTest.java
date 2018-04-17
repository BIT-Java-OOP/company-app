package bit.javaoop;

import bit.javaoop.company.Employee;
import bit.javaoop.employmentpolicy.B2b;
import bit.javaoop.salarycalculator.ExtraSalary;
import bit.javaoop.salarycalculator.NormalSalary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void shouldBeSatisfied() {
        //given
        Employee employee1 = new Employee("Bogaty pracownik", 50_000, new B2b(), new NormalSalary());
        //when
        boolean result = employee1.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void shouldGetNormalSalary() {
        //give
        Employee employee1 = new Employee("Bogaty pracownik", 50_000, new B2b(), new NormalSalary());
        //when
        boolean result = employee1.getSalary() == 50_000;
        //then
        assertTrue(result);
    }

    @Test
    void shouldGetExtraSalary() {
        //give
        Employee employee1 = new Employee("Bogaty pracownik", 50_000, new B2b(), new ExtraSalary());
        //when
        boolean result = employee1.getSalary() == 75_000;
        //then
        assertTrue(result);
    }
}
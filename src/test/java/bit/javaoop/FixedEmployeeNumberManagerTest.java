package bit.javaoop;

import bit.javaoop.company.Employee;
import bit.javaoop.company.FixedEmployeeNumberManager;
import bit.javaoop.employmentpolicy.B2b;
import bit.javaoop.employmentpolicy.EmploymentContract;
import bit.javaoop.salarycalculator.ExtraSalary;
import bit.javaoop.salarycalculator.NormalSalary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FixedEmployeeNumberManagerTest {

    Employee employee_1 = new Employee("Pracownik_1", 10_000, new B2b(), new NormalSalary());
    Employee employee_2 = new Employee("Pracownik_2", 15_000, new EmploymentContract(), new NormalSalary());
    Employee employee_3 = new Employee("Pracownik_3", 20_000, new B2b(), new ExtraSalary());

    @Test
    void shouldHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, new B2b(), new ExtraSalary(), 2);
        //when
        boolean result = manager.hireIfPossible(employee_1) && manager.hireIfPossible(employee_2);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, new EmploymentContract(), new ExtraSalary(), 2);
        //when
        boolean result = manager.hireIfPossible(employee_1) && manager.hireIfPossible(employee_2) && manager.hireIfPossible(employee_3);
        //then
        assertFalse(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, new EmploymentContract(), new NormalSalary(), 2);
        manager.hireIfPossible(employee_1);
        manager.hireIfPossible(employee_2);
        //when
        boolean result = manager.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfied() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Manager_1", 25_000, new B2b(), new NormalSalary(), 2);
        //when
        boolean result = !manager.isSatisfied();
        //then
        assertTrue(result);
    }
}

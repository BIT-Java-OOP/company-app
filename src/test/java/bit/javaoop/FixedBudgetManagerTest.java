package bit.javaoop;

import bit.javaoop.company.Employee;
import bit.javaoop.company.FixedBudgetManager;
import bit.javaoop.employmentpolicy.B2b;
import bit.javaoop.employmentpolicy.EmploymentContract;
import bit.javaoop.salarycalculator.ExtraSalary;
import bit.javaoop.salarycalculator.NormalSalary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedBudgetManagerTest {

    Employee employee_1 = new Employee("Pracownik_1", 10_000, new B2b(), new NormalSalary());
    Employee employee_2 = new Employee("Pracownik_2", 15_000, new EmploymentContract(), new NormalSalary());
    Employee employee_3 = new Employee("Pracownik_3", 20_000, new B2b(), new ExtraSalary());

    @Test
    void shouldHireEmployees() {
        //given
        FixedBudgetManager manager = new FixedBudgetManager("Manager_1", 25_000, new B2b(), new NormalSalary(), 30_000);
        //when
        boolean result = manager.hireIfPossible(employee_1) && manager.hireIfPossible(employee_2);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotHireEmployees() {
        //given
        FixedBudgetManager manager = new FixedBudgetManager("Manager_1", 25_000, new B2b(), new ExtraSalary(), 30_000);
        //when
        boolean result = manager.hireIfPossible(employee_1) && manager.hireIfPossible(employee_2) && manager.hireIfPossible(employee_3);
        //then
        assertTrue(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        FixedBudgetManager manager = new FixedBudgetManager("Manager_1", 25_000, new EmploymentContract(), new NormalSalary(), 30_000);
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
        FixedBudgetManager manager = new FixedBudgetManager("Manager_1", 15_000, new B2b(), new ExtraSalary(), 30_000);
        //when
        boolean result = manager.isSatisfied();
        //then
        assertFalse(result);
    }
}

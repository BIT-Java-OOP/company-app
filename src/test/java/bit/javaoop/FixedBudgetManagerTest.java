package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {
    @Test
    void shouldBeAbleToHireEmployees() {
        //given
        AbstractManager manager = new FixedBudgetManager("Arnold", 50_000, 50_000);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 10_000)
        );

        //when
        boolean result = manager.canHireEmployees();

        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeAbleToHireEmployees() {
        //given
        AbstractManager manager = new FixedBudgetManager("Arnold", 50_000, 50_000);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 12_000)
        );

        //when
        boolean result = manager.canHireEmployees();

        //then
        assertFalse(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        AbstractManager manager = new FixedBudgetManager("Arnold", 40_000, 60_000);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 10_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 10_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 10_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Czwarty", 20_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfiedBecauseOfSalary() {
        //given
        AbstractManager manager = new FixedBudgetManager("Arnold", 10_000, 50_000);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 36_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //then
        assertFalse(result);
    }

    @Test
    void shouldNotBeSatisfiedBecauseOfBudget() {
        //given
        AbstractManager manager = new FixedBudgetManager("Arnold", 50_000, 50_000);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 11_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //then
        assertFalse(result);
    }
}
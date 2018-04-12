package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void shouldBeAbleToHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Arnold", 40_000, 3);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 24_000)
        );

        //when
        boolean result = manager.canHireEmployees();

        //result
        assertTrue(result);
    }

    @Test
    void shouldNotBeAbleToHireEmployees() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Arnold", 40_000, 3);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 24_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 21_000)
        );

        //when
        boolean result = manager.canHireEmployees();

        //result
        assertFalse(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Arnold", 50_000, 3);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 24_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 24_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //result
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfiedBecauseOfSalary() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Arnold", 10_000, 3);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 24_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Trzeci", 21_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //result
        assertFalse(result);
    }

    @Test
    void shouldNotBeSatisfiedBecauseOfFreePositions() {
        //given
        FixedEmployeeNumberManager manager = new FixedEmployeeNumberManager("Arnold", 50_000, 3);
        manager.addEmployee(
                new Employee("Arnolda Podwładny Pierwszy", 20_000)
        );
        manager.addEmployee(
                new Employee("Arnolda Podwładny Drugi", 24_000)
        );

        //when
        boolean result = manager.isSatisfied();

        //result
        assertFalse(result);
    }
}
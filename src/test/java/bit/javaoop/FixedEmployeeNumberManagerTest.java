package bit.javaoop;

import bit.javaoop.calculator.GrossSalaryCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.company.manager.AbstractManager;
import bit.javaoop.company.manager.FixedEmployeeNumberManager;
import bit.javaoop.employment.EmploymentContract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedEmployeeNumberManagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldNotBeSatisfiedDueToSalary() {

        //given
        AbstractManager lowSalaryManager = new FixedEmployeeNumberManager("Pan manager", 10_000, 0);

        //when
        boolean result = lowSalaryManager.isSatisfied();

        //then
        assertTrue(!result);
    }

    @Test
    void shouldNotBeSatisfiedDueToFreeSpots() {

        //given
        AbstractManager lowSalaryManager = new FixedEmployeeNumberManager("Pan manager", 40_000, 6);

        //when
        boolean result = lowSalaryManager.isSatisfied();

        //then
        assertTrue(!result);
    }

    @Test
    void shouldBeSatisfied() {

        //given
        AbstractManager highSalaryManager = new FixedEmployeeNumberManager("Bogaty pan manager", 50_000, 0);

        //when
        boolean result = highSalaryManager.isSatisfied();

        //then
        assertTrue(result);
    }

    @Test
    void shouldBeHired() {

        //given
        AbstractManager managerWhoHasFreeSpots = new FixedEmployeeNumberManager("Pan Manager", 50_000, 10);
        AbstractEmployee someoneWhoNeedsAJob = new Employee("Gosia", 3_000, new GrossSalaryCalculator(), new EmploymentContract());

        //when
        boolean result = managerWhoHasFreeSpots.hireIfPossible(someoneWhoNeedsAJob);

        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeHired() {

        //given
        AbstractManager managerWhoDoesNotHaveFreeSpots = new FixedEmployeeNumberManager("Pan Manager", 50_000, 0);
        AbstractEmployee someoneWhoNeedsAJob = new Employee("Gosia", 3_000, new GrossSalaryCalculator(), new EmploymentContract());

        //when
        boolean result = managerWhoDoesNotHaveFreeSpots.hireIfPossible(someoneWhoNeedsAJob);

        //then
        assertTrue(!result);
    }

}
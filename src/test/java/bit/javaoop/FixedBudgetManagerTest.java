package bit.javaoop;

import bit.javaoop.calculator.GrossSalaryCalculator;
import bit.javaoop.calculator.NetRevenueCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.company.manager.AbstractManager;
import bit.javaoop.company.manager.FixedBudgetManager;
import bit.javaoop.employment.B2B;
import bit.javaoop.employment.EmploymentContract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FixedBudgetManagerTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldBeSatisfied() {
        //given
        AbstractManager highSalaryManager = new FixedBudgetManager("Bogaty pan Manager", 50_000,10_000);

        //when
        boolean result = highSalaryManager.isSatisfied();

        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfied(){
        //given
        AbstractManager lowSalaryManager = new FixedBudgetManager("Mniej bogaty pan Manager",1_000,20_000);

        //when
        boolean result = lowSalaryManager.isSatisfied();

        //then
        assertTrue(!result);
    }

    @Test
    void shouldBeHired() {
        //given
        AbstractManager managerWhoHiresEmployees = new FixedBudgetManager("Pan Manager", 50_000, 5_000);
        AbstractEmployee personWhoWantsToGetAJob = new Employee("Pan Mietek", 2_000,new GrossSalaryCalculator(),new B2B());

        //when
        boolean isMietekHired = managerWhoHiresEmployees.hireIfPossible(personWhoWantsToGetAJob);

        //then
        assertTrue(isMietekHired);
    }


    @Test
    void shouldNotBeHired(){
        //given
        AbstractManager managerWhoHiresEmployees = new FixedBudgetManager("Pan Manager", 1_000,5_000);
        AbstractEmployee personWhoWantsToGetAJob = new Employee("Pani Hania", 10_000,new GrossSalaryCalculator(),new B2B());

        //when
        boolean isHaniaHired = managerWhoHiresEmployees.hireIfPossible(personWhoWantsToGetAJob);

        //then
        assertTrue(!isHaniaHired);
    }

}
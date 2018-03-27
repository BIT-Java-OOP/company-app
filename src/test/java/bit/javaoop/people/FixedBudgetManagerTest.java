package bit.javaoop.people;

import bit.javaoop.CompanyAppException;
import bit.javaoop.CompanyAppExceptionMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    private Manager manager;
    private AbstractEmployee employee;
    private double testHiringBudget;

    @BeforeEach
    void init() {
        testHiringBudget = 30_000;
        manager = new FixedBudgetManager("Manager", 30_000, testHiringBudget);
        employee = new Employee("E1", 1_000);
    }

    @Test
    void testIfCanNotHireEmployeeWithTooBigSalary() throws CompanyAppException {
        employee = new Employee("E1", 100_000);

        assertFalse(manager.canHireEmployee(employee));
    }

    @Test
    void testIfCanHireEmployeeWithNormalSalary() throws CompanyAppException {
        assertTrue(manager.canHireEmployee(employee));
    }

    @Test
    void testIfCanHireSecondEmployeesUnderBudget() throws CompanyAppException {
        AbstractEmployee employee2 = new Employee("E2", 3_000);
        manager.hire(employee);

        assertTrue(manager.canHireEmployee(employee2));
    }

    @Test
    void testIfCanNotHireSecondEmployeesAboveBudget() throws CompanyAppException {
        AbstractEmployee employee2 = new Employee("E2", 30_000);
        manager.hire(employee);

        assertFalse(manager.canHireEmployee(employee2));
    }

    @Test
    void testHiringAboveBudget() {
        employee = new Employee("E1", 100_000);

        Exception ex = assertThrows(CompanyAppException.class, () -> manager.hire(employee));
        Assertions.assertEquals(CompanyAppExceptionMessage.BUDGET_OVERFLOW.toString(), ex.getMessage());
    }

    @Test
    void testHiringNull() {
        Exception ex = assertThrows(CompanyAppException.class, () -> manager.hire(null));
        assertEquals(CompanyAppExceptionMessage.NULL_ARG.toString(), ex.getMessage());
    }

    @Test
    void testHiringTheSameEmployeeTwice() {
        try {
            manager.hire(employee);
        } catch (Exception e) {
            fail("Internal test error!");
        }
        Exception ex = assertThrows(CompanyAppException.class, () -> manager.hire(employee));
        assertEquals(CompanyAppExceptionMessage.EMPLOYEE_ALREADY_HIRED.toString(), ex.getMessage());
    }

    @Test
    void checkIfManagerIsSatisfied() {
        assertTrue(manager.isSatisfied());
    }

    @Test
    void checkIfManagerIsNotSatisfiedWhenHisSalaryIsLow() {
        manager = new FixedBudgetManager("Manager", 3_000, testHiringBudget);

        assertFalse(manager.isSatisfied());
    }

    @Test
    void checkIfManagerIsNotSatisfiedWhenThereIsTooLowBudgetRemains() throws CompanyAppException {
        employee = new Employee("E1", 15_000);
        manager.hire(employee);

        assertFalse(manager.isSatisfied());
    }
}
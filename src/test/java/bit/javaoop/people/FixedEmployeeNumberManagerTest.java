package bit.javaoop.people;

import bit.javaoop.CompanyAppException;
import bit.javaoop.CompanyAppExceptionMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    private Manager manager;
    private List<AbstractEmployee> testEmployees;

    @BeforeEach
    void init() throws CompanyAppException {
        int testMaxNumberOfEmployees = 2;

        testEmployees = new ArrayList<>();
        manager = new FixedEmployeeNumberManager("Manager", 30_000, testMaxNumberOfEmployees);

        testEmployees.add(new Employee("E1", 1_000));
        testEmployees.add(new Employee("E2", 2_000));
        testEmployees.add(new Employee("E3", 3_000));

        manager.hire(testEmployees.get(0));
        manager.hire(testEmployees.get(1));
    }

    @Test
    void testIfCanNotHireEmployeeWhenMaxNumberIsAchieved() throws CompanyAppException {
        assertFalse(manager.canHireEmployee(testEmployees.get(2)));
    }

    @Test
    void testHiringEmployeeWhenLimitIsExceeded() {
        Exception ex = assertThrows(CompanyAppException.class, () -> manager.hire(testEmployees.get(2)));
        Assertions.assertEquals(CompanyAppExceptionMessage.EMPLOYEES_LIMID_EXCEEDED.toString(), ex.getMessage());
    }

    @Test
    void checkIfManagerIsSatisfied() {
        assertTrue(manager.isSatisfied());
    }

    @Test
    void checkIfManagerIsNotSatisfiedWhenHisSalaryIsLow() {
        manager = new FixedEmployeeNumberManager("Manager 2", 300, 2);

        assertFalse(manager.isSatisfied());
    }

    @Test
    void checkIfManagerIsNotSatisfiedWhenThereAreFreeSpotsLeft() {
        manager = new FixedEmployeeNumberManager("Manager 2", 30_000, 2);

        assertFalse(manager.isSatisfied());
    }
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void shuldHireEmployeeIfPossible() {

        //given
        Manager man = new FixedBudgetManager("Jan", 12, 12);

        String nameTwo = "Janina";
        Employee employeeTwo = new Employee(nameTwo, 12);

        //then
        assertEquals(0, man.getEmployees().size());

        //when
        man.hireEmployeeIfPossible(employeeTwo);

        //then
        assertEquals(1, man.getEmployees().size());
        assertEquals(nameTwo, man.getEmployees().get(0).getName());

    }

    @Test
    void shouldDoToString() {
        //given       / when
        Manager man = new FixedBudgetManager("Jan", 12, 12);

        //then
        assertEquals( man.getName() + " - Manager", man.toString());

    }

}
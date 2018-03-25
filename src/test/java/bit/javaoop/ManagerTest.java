package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void hireEmployee() {
        Manager man = new FixedBudgetManager("Jan", 12, 12);
        assertEquals(0, man.getEmployees().size());
        man.hireEmployee(new Employee("Janina", 12));
        assertEquals(1, man.getEmployees().size());
        assertEquals("Janina", man.getEmployees().get(0).getName());

    }

    @Test
    void tostring() {
        Manager man = new FixedBudgetManager("Jan", 12, 12);
        man.hireEmployee(new Employee("Janina", 12));
        assertEquals("\t\t" + man.getName() + " - Manager\n\t\t\tJanina - Employee\n", man.toString());

    }

}
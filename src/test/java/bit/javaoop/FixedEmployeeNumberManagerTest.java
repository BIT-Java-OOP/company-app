package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void isSatisfied_1() {
        AbstractManager manager = new FixedEmployeeNumberManager("Macko",25_000, 2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        manager.hire(employee);
        manager.hire(employee2);
        assertTrue(manager.isSatisfied());
    }

    @Test
    void isSatisfied_2(){
        AbstractManager manager = new FixedEmployeeNumberManager("Macko",25_000,2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        manager.hire(employee);
        assertFalse(manager.isSatisfied());
    }

    @Test
    void isSatisfied_3(){
        AbstractManager manager = new FixedEmployeeNumberManager("Macko",19_000,2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        manager.hire(employee);
        manager.hire(employee2);
        assertFalse(manager.isSatisfied());
    }

    @Test
    void canHire_1(){
        AbstractManager manager = new FixedEmployeeNumberManager("Macko",19_000,2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        AbstractEmployee employee3 = new Employee("Robak3", 10_000);
        manager.hire(employee);
        manager.hire(employee2);
        assertFalse(manager.CanHire(employee3));
    }
    @Test
    void canHire_2(){
        AbstractManager manager = new FixedEmployeeNumberManager("Macko",19_00, 2);
        AbstractEmployee employee = new Employee("Robak1", 10_000);
        AbstractEmployee employee2 = new Employee("Robak2", 10_000);
        manager.hire(employee);
        assertTrue(manager.CanHire(employee2));
    }

}
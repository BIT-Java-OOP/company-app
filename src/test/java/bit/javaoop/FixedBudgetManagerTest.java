package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void isSatisfied_1(){
        AbstractManager manager = new FixedBudgetManager("Jacek",21_000, 100_000);
        AbstractEmployee employee = new Employee("PolakRobak",90_000);
        manager.hire(employee);
        assertTrue(manager.isSatisfied());
    }

    @Test
    void isSatisfied_2(){
        AbstractManager manager = new FixedBudgetManager("Mirek", 19_000, 100_000);
        AbstractEmployee employee = new Employee("Pajac", 10_000 );
        assertFalse(manager.isSatisfied());
    }
    @Test
    void isSatisfied_3(){
        AbstractManager manager = new FixedBudgetManager("Clenbuterol", 21_000, 50_000);
        AbstractEmployee employee = new Employee("pierwszy", 30_000);
        AbstractEmployee employee2 = new Employee ("drugi", 20_000);
        manager.hire(employee);
        manager.hire(employee2);
        assertFalse(manager.isSatisfied());
    }
    @Test
    void canHire(){
        AbstractManager manager = new FixedBudgetManager("Maciek", 19_000, 50_000);
        AbstractEmployee employee = new Employee("pierwszy", 30_000);
        AbstractEmployee employee2 = new Employee ("drugi", 20_001);
        manager.hire(employee);
        manager.hire(employee2);
        AbstractEmployee employee3 = new Employee("trzeci", 20_000);
        assertFalse(manager.CanHire(employee3));
    }

    @Test
    void canHire_2(){
        AbstractManager manager = new FixedBudgetManager("Maciek", 19_000, 50_000);
        AbstractEmployee employee2 = new Employee ("drugi", 20_000);
        assertTrue(manager.CanHire(employee2));
    }
}
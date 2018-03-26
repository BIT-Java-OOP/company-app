package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetManagerTest {

    private Company company;
    private Company company2;
    private AbstractEmployee employee1;
    private  AbstractEmployee employee2;
    private AbstractEmployee employee3;
    private  AbstractManager manager1;
    private AbstractManager manager2;

    @BeforeEach
    void setUp() {
        company = new Company("One");
        company2 = new Company("Two");
        employee1 = new Employee("Prac1", 12_000);
        employee2 = new Employee("Prac2", 10_000);
        employee3 = new Employee("Prac3", 15_000);
        manager1 = new BudgetManager("Gucio", 25_000, 40_000, company);
        manager2 = new BudgetManager("Guciosław", 10_000, 20_000, company2);
    }

    @Test
    void shouldHire() {
        //given
        manager1.hireNewEmployee(employee1,company);
        manager1.hireNewEmployee(employee2,company);
        //when
        boolean result = manager1.canHire(employee3);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotHire() {
        //given
        manager1.hireNewEmployee(employee1,company);
        manager1.hireNewEmployee(employee2,company);
        manager2.hireNewEmployee(employee2,company);
        //when
        boolean result = manager1.canHire(employee1) || manager2.canHire(employee3); //Manager1 hiring this same employee; Manager2's budget exceeded
        //then
        assertFalse(result);
    }


    @Test
    void shouldHireNewEmployee() {
        //given
        manager1.hireNewEmployee(employee1,company);
        //when
        boolean result = manager1.getEmployeesList().contains(employee1);
        //then
        assertTrue(result);
    }

    @Test
    void ShouldNotHireNewEmployee() {
        //given
        manager2.hireNewEmployee(employee1,company);
        manager2.hireNewEmployee(employee2,company);
        //when
        boolean result = manager2.getEmployeesList().contains(employee2); //Manager2 dont have money to hire
        //then
        assertFalse(result);
    }

    @Test
    void shouldBeSatisfied() {
        //given
        manager1.hireNewEmployee(employee1,company);
        manager1.hireNewEmployee(employee2,company);
        manager1.hireNewEmployee(employee3,company);
        //when
        boolean result = manager1.isSatisfied();
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotBeSatisfied() {
        //given
        manager1.hireNewEmployee(employee1,company);
        manager1.hireNewEmployee(employee2,company);
        //when
        boolean result = manager1.isSatisfied() || manager2.isSatisfied(); //Manager1 has to much spare money; Manager2 has to little salary
        //then
        assertFalse(result);
    }
}
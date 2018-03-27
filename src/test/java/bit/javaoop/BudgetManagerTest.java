package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetManagerTest {

    @Test
    void isHire() {
    }

    @Test
    void addEmployee() {
        List testLista = new ArrayList();
        Employee testEmployee=new Employee("New Worker",10000);
        double salary=testEmployee.getSalary();
        String name=testEmployee.getName();
        //testEmployee.isHire();
        //nie wiem co dalej
    }

    @Test
    void isSatisfied() {
        //given
        BudgetManager testEmployee = new BudgetManager("Satisfied Worker", 50_000);
        //when
        boolean result = testEmployee.isSatisfied();
        //then
        assertTrue(result);
    }
}
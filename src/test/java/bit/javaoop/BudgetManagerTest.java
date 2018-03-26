package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BudgetManagerTest {

    @Test
    void shouldBeHire() {
        //given
        Manager highSalaryManager = new BudgetManager("menago", 5_0000,10000);
        Employee employee = new Employee("andrzej",8000);
        //when
        boolean result = highSalaryManager.canHire(employee);
        //then
        assertTrue(result);
    }




    @Test
    void shouldNotBeHire() {
        //given

        Manager highSalaryManager = new BudgetManager("menago", 5_0000,10000);
        Employee employee = new Employee("andrzej",100000);
        //when
        boolean result = highSalaryManager.canHire(employee);
        //then
        assertFalse(result);
    }


}

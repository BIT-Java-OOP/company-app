package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeNumberManagerTest {
    @Test
    void shouldBeSatified() {
        //given
        Manager highSalaryManager = new EmployeeNumberManager("menago", 5_0000, 2);
        Employee employee = new Employee("andrzej", 8_000);
        Employee employee2 = new Employee("wiechu", 18_000);

        highSalaryManager.hireNewEmployee(employee);
        highSalaryManager.hireNewEmployee(employee2);
        //when
        boolean result = highSalaryManager.isSatisfied();
        //then
        assertTrue(result);
    }
}

package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedBudgetManagerTest {

    @Test
    void canHire() {
        //given
        Manager MrPrezes = new FixedBudgetManager("Andrzeju", 35_000, 16_000);
        Employee Pracownik = new Employee("Wieslav", 3_000);
        //when
        boolean result = MrPrezes.canHire(Pracownik);
        //then
        assertTrue(result);
    }
}
package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void canHire() {
        //given
            FixedEmployeeNumberManager Menedzerka=new FixedEmployeeNumberManager("Zosia", 25_000, 0);
            Employee Pracowniczka=new Employee("Tosia", 1_500);
        //when
            boolean result=Menedzerka.canHire(Pracowniczka);
        //then
            assertFalse(result);
    }
}
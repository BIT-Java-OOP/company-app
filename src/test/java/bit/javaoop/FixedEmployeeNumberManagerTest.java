package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void canHire() {
        //given
        AbstractManager m = new FixedEmployeeNumberManager("Sławomir", 40000, 1);
        AbstractEmployee e = new Employee("Stara Cholera", 300);
        //then
        assertTrue(m.canHire(e));

    }

    void canNotHire() {

        //given
        AbstractManager m = new FixedEmployeeNumberManager("Sławomir", 40000, 1);
        AbstractEmployee e1 = new Employee("Stara Cholera", 300);
        AbstractEmployee e2 = new Employee("Magdalena", 300);
        //when
        m.hireIfPossible(e1);
        //then
        assertFalse(m.canHire(e2));
    }


    @Test
    void isSatisfied() {
        AbstractManager m = new FixedEmployeeNumberManager("Sławomir", 1, 1);
        assertFalse(m.isSatisfied());
    }
}
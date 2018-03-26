package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedEmployeeNumberManagerTest {

    @Test
    void canhire() {
        AbstractManager m=new FixedEmployeeNumberManager("Sławomir",40000, 1);
        AbstractEmployee e= new Employee("Stara Cholera", 300);
        assertTrue(m.canhire(e));
        m.hire(e);
        assertFalse(m.canhire(e));
    }

    @Test
    void isSatisfied() {
        AbstractManager m=new FixedEmployeeNumberManager("Sławomir",1, 1);
        assertFalse(m.isSatisfied());
    }
}
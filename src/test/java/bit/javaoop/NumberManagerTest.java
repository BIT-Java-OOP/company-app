package bit.javaoop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberManagerTest {
    private Manager m1, m2;
    private AbstractEmployee e1, e2;

    @BeforeEach
    void setUp() {
        m1 = new FixedEmployeeNumberManager("", 10000, 1);
        m2 = new FixedEmployeeNumberManager("", 21000, 2);
        e1 = new Employee("", 100);
        e2 = new Employee("", 2_000);
    }

    @Test
    void shouldHire() {
        //given

        //when
        m1.hire(e1);
        m1.hire(e2);
        m2.hire(e1);
        m2.hire(e2);
        //then
        assertEquals(1, m1.getEmployees_list().size());
        assertEquals(2, m2.getEmployees_list().size());
    }

    @Test
    void shouldCouldHaveHired() {
        //when
        m1.hire(e1);
        m2.hire(e1);
        //then
        assertEquals(false, m1.canHire(e2));
        assertEquals(true, m2.canHire(e2));
    }

    @Test
    void shouldBeSatisfied() {
        //given
        Manager m3 = new FixedEmployeeNumberManager("", 22001, 1);
        Manager m4 = new FixedEmployeeNumberManager("", 12001, 2);
        //when
        m1.hire(e1);
        m2.hire(e1);
        m3.hire(e1);
        m4.hire(e1);
        //then
        assertEquals(false, m1.isSatisfied());
        assertEquals(false, m2.isSatisfied());
        assertEquals(true, m3.isSatisfied());
        assertEquals(false, m4.isSatisfied());
    }
}

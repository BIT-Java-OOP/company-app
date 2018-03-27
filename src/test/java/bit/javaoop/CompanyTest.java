package bit.javaoop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CompanyTest {
    @Test
    void shouldToString() {
        //given
        Manager m1 = new FixedBudgedManager("m2", 15001, 20001);
        AbstractEmployee e1 = new Employee("e1", 100);
        CEO ceo = new CEO("c1");
        Company company = new Company("", ceo);
        String text="";
        String text2="";
        //when
        m1.hire(e1);
        ceo.addManager(m1);
        text += ceo.toString() + "\n" +
                "\t" + m1.toString() + "\n" +
                "\t\t" + e1.toString() + "\n";
        //then
        assertEquals(text,company.toString());
        assertNotEquals(text2,company.toString());



    }
}

package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompanyTest {
    @Test
    void CompanyStringShouldBeSameAfterCeoChange() {
        CEO ceo = new CEO("steve", 12321);
        Company company = new Company("abba", ceo);
        CEO ceo2 = new CEO("majk", 123221);
        LinkedList<Manager> managers1 = ceo.getManagers();

        company.hireNewCeo(ceo2);

        LinkedList<Manager> managers2 = ceo2.getManagers();

        boolean result = managers2.equals(managers1);

        assertTrue(result);

    }


}

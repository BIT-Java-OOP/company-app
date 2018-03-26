package bit.javaoop;

import bit.javaoop.people.Ceo;
import bit.javaoop.people.Employee;
import bit.javaoop.people.FixedEmployeeNumberManager;
import bit.javaoop.people.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompanyTest {

    private Company myCompany;

    @BeforeEach
    void init() throws CompanyAppException {
        Ceo ceo = new Ceo("Boss", 1_000_000);
        myCompany = new Company("My Company", ceo);

        Manager manager1 = new FixedEmployeeNumberManager("Man 1", 50_000, 3);
        manager1.hire(new Employee("E1", 1_000));
        manager1.hire(new Employee("E2", 1_000));
        Manager manager2 = new FixedEmployeeNumberManager("Man 2", 50_000, 1);
        manager2.hire(new Employee("E3", 1_000));

        myCompany.hireManager(manager1);
        myCompany.hireManager(manager2);
    }

    @Test
    void testCompanyStructure() {
        assertEquals("Boss - CEO\n" +
                        "\tMan 1 - Manager\n" +
                        "\t\tE1 - Employee\n" +
                        "\t\tE2 - Employee\n" +
                        "\tMan 2 - Manager\n" +
                        "\t\tE3 - Employee\n",
                myCompany.toString());
    }

    @Test
    void testIfCeoHasActualManagersList() {
        assertEquals(myCompany.getManagers(), myCompany.getCeo().getManagers());
    }
}
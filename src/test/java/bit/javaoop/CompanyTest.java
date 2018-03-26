package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompanyTest {

    @Test
    void toStringMethodOutputIsCorrect(){
        CEO ceo = new CEO("Staszek");
        Manager m1 = new FixedBudgetManager("Wiesiek", 30000);
        Manager m2 = new FixedEmploeeNumberManager("Romek", 20000);
        Employee e1 = new Employee("Mirek", 2000);
        if(m1.canHire(e1)) m1.hire(e1);
        ceo.addManager(m1).addManager(m2);
        Company company = new Company(ceo, "firma");

        assertEquals(
                "firma\n" +
                        "CEO: Staszek\n" +
                        "\t MANAGER: Wiesiek\n" +
                        "\t\t EMPLOYEE: Mirek\n" +
                        "\t MANAGER: Romek\n" , company.toString());
    }
}

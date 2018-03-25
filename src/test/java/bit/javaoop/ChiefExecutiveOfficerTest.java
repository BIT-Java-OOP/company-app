package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChiefExecutiveOfficerTest {
    @Test
    void toStringTest() {

        ChiefExecutiveOfficer chiefExecutiveOfficer = new ChiefExecutiveOfficer("Oktawian August");
        Manager manager = new FixedBudgetManager("Poncjusz Piłat", 30_000, 80_000);
        Employee employee1 = new Employee("Barabasz", 50_000);
        Employee employee2 = new Employee("Łukasz Stanisławowski", 20_000);

        manager.getEmployeeList().add(employee1);
        manager.getEmployeeList().add(employee2);
        chiefExecutiveOfficer.getManagerList().add(manager);


        String result = chiefExecutiveOfficer.toString();

        assertEquals("Oktawian August - CEO\n\tPoncjusz Piłat - Manager\n\t\tBarabasz - Employee\n\t\tŁukasz Stanisławowski - Employee", result);

    }
}

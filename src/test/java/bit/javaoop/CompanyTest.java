package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {
    @Test
    public void toStringTest() {
        ChiefExecutiveOfficer chiefExecutiveOfficer = new ChiefExecutiveOfficer("Oktawian August");
        Manager manager = new FixedBudgetManager("Poncjusz Piłat", 30_000, 80_000);
        Employee employee1 = new Employee("Barabasz", 50_000);
        Employee employee2 = new Employee("Łukasz Stanisławowski", 20_000);
        manager.getEmployeeList().add(employee1);
        manager.getEmployeeList().add(employee2);
        chiefExecutiveOfficer.getManagerList().add(manager);
        Company company = new Company("Imperium Romanum", chiefExecutiveOfficer);

        String result = company.toString();

        assertEquals("Imperium Romanum:\n" +
                        "Oktawian August - CEO\n" +
                        "\tPoncjusz Piłat - Manager\n" +
                        "\t\tBarabasz - Employee\n" +
                        "\t\tŁukasz Stanisławowski - Employee\n",
                result);
    }

    public void testHiringChiefExecutiveOfficer() {
        ChiefExecutiveOfficer chiefExecutiveOfficer = new ChiefExecutiveOfficer("Juliusz Cezar");
        Company company = new Company("Imperium Romanum", chiefExecutiveOfficer);

        company.hireChiefExecutiveOfficer(new ChiefExecutiveOfficer("Oktawian August"));
        String result = company.getChiefExecutiveOfficer().getName();

        assertEquals("Oktawian August", result);
    }
}

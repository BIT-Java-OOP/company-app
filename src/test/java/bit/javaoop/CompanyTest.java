package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void castToString() {
        Employee employee1 = new Employee("Employee 1", 10_000);
        Employee employee2 = new Employee("Employee 2", 10_000);
        FixedBudgetManager manager1 = new FixedBudgetManager("Manager 1", 25_000, 15_000);
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("Manager 2", 25_000, 5);
        CEO ceo1 = new CEO("CEO 1");
        Company company1 = new Company("Company 1", ceo1);
        manager1.hire(employee1);
        manager2.hire(employee2);
        ceo1.hireManager(manager1);
        ceo1.hireManager(manager2);

        String expectedResponse = "CEO 1 - CEO\n"
                + "\tManager 1 - Manager\n"
                + "\t\tEmployee 1 - Employee\n"
                + "\tManager 2 - Manager\n"
                + "\t\tEmployee 2 - Employee\n";
        String actualResponse = company1.toString();
        boolean stringsEqual = expectedResponse.equals(actualResponse);

        assertTrue(stringsEqual);
    }
}
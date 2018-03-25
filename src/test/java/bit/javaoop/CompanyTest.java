package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void toString_1() {
        AbstractEmployee employee = new Employee("Wacek", 8_000);
        AbstractEmployee employee3 = new Employee("Leszek", 7_000);
        AbstractEmployee employee4 = new Employee("Frodo", 7_000);
        AbstractManager manager1 = new FixedBudgetManager("Grzesiek", 25_000, 100_000);
        AbstractManager manager2 = new FixedBudgetManager("Maciek", 25_000, 100_000);
        AbstractManager manager3 = new FixedEmployeeNumberManager("Krzysiek", 19_000, 2);
        CEO ceo_1 = new CEO("Zbyszek");
        Company company = new Company("THICC");
        company.hireNewCeo(ceo_1);
        ceo_1.addManager(manager2);
        ceo_1.addManager(manager1);
        ceo_1.addManager(manager3);
        manager2.hire(employee);
        manager2.hire(employee3);
        manager3.hire(employee4);
        String output = company.toString();
        assertTrue(output.equals("THICC - Company name\n" +
                "\tZbyszek - CEO\n" +
                "\t\tMaciek - Manager\n" +
                "\t\t\tWacek - Employee\n" +
                "\t\t\tLeszek - Employee\n" +
                "\t\tGrzesiek - Manager\n" +
                "\t\tKrzysiek - Manager\n" +
                "\t\t\tFrodo - Employee\n"));
    }

    @Test
    void newCeo() {
        AbstractEmployee employee = new Employee("Wacek", 8_000);
        AbstractEmployee employee3 = new Employee("Leszek", 7_000);
        AbstractEmployee employee4 = new Employee("Frodo", 7_000);
        AbstractManager manager1 = new FixedBudgetManager("Grzesiek", 25_000, 100_000);
        AbstractManager manager2 = new FixedBudgetManager("Maciek", 25_000, 100_000);
        AbstractManager manager3 = new FixedEmployeeNumberManager("Krzysiek", 19_000, 2);
        CEO ceo_1 = new CEO("Zbyszek");
        CEO ceo_2 = new CEO("Walery");
        Company company = new Company("THICC");
        company.hireNewCeo(ceo_1);
        ceo_1.addManager(manager2);
        ceo_1.addManager(manager1);
        ceo_1.addManager(manager3);
        manager2.hire(employee);
        manager2.hire(employee3);
        manager3.hire(employee4);
        company.hireNewCeo(ceo_2);
        manager3.hire(employee);
        String output = company.toString();
        assertTrue(output.equals("THICC - Company name\n" +
                "\tWalery - CEO\n" +
                "\t\tMaciek - Manager\n" +
                "\t\t\tWacek - Employee\n" +
                "\t\t\tLeszek - Employee\n" +
                "\t\tGrzesiek - Manager\n" +
                "\t\tKrzysiek - Manager\n" +
                "\t\t\tFrodo - Employee\n" +
                "\t\t\tWacek - Employee\n"));
    }

}
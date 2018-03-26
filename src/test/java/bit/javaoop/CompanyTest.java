package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void hireCEO() {
        Company company=new Company("Test company");
        CEO ceo=new CEO("Tomek", 50_000);
        company.hireCEO(ceo);

        assertEquals(ceo,company.ceo);

    }

    @Test
    void hireOnlyOneCEO() {
        Company company=new Company("Test company");
        CEO ceo=new CEO("Tomek", 50_000);
        company.hireCEO(ceo);

        CEO ceo2=new CEO("Zbyszek", 50_000);
        company.hireCEO(ceo2);

        assertEquals(ceo2,company.ceo);

    }

    @Test
    void companytoString() {
        Company company=new Company("BestCompany");
        company.ceo=new CEO("Zbyszek", 50_000);
        company.ceo.listofManagers=new ArrayList<>();
        company.ceo.HireManager(new FixedBudgetManager("Maciek", 25_000, 10_000));
        company.ceo.listofManagers.get(0).listofEmployees=new ArrayList<>();
        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Wacek", 5_000));
        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Leszek", 4_000));
        company.ceo.listofManagers.get(0).HireEmployee(new Employee("Michał", 5_000));
        company.ceo.HireManager(new FixedEmployeeNumberManager("Krzysiek", 15_000, 3));
        company.ceo.listofManagers.get(1).listofEmployees=new ArrayList<>();
        company.ceo.listofManagers.get(1).HireEmployee(new Employee("Frodo", 5_000));

        String str="Zbyszek- CEO \n\tMaciek- Manager \n\t\tWacek- Employee \n\t\tLeszek- Employee \n\tKrzysiek- Manager \n\t\tFrodo- Employee \n";

        assertEquals(str,company.toString());

    }
}
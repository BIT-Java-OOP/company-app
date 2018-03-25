package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    void hireNewCeo() {

        CEO newCeo = new CEO("Adam");
        CEO oldCeo = new CEO("Ala", Arrays.asList(new Manager[]{new FixedBudgetManager("A", 1, 1), new FixedEmployeeNumberManager("B", 2, 2)}));
        List<Manager> oldList = oldCeo.getManagersList();
        Company company = new Company("C", oldCeo);
        company.hireNewCeo(newCeo);
        assertEquals("Adam", company.getCeo().getName());
        assertEquals(oldList, company.getCeo().getManagersList());


    }

    @Test
    void tostring() {

        Company company = new Company("CCC");
        company.hireNewCeo(new CEO("Adam"));
        FixedBudgetManager fbm1 = new FixedBudgetManager("Adam_budget ", 3000, 900);
        company.getCeo().hireManager(fbm1);
        FixedBudgetManager fbm2 = new FixedBudgetManager("Ela_budget ", 30800, 77900);
        company.getCeo().hireManager(fbm2);
        FixedEmployeeNumberManager fenm1 = new FixedEmployeeNumberManager("Kasia_limit", 2000, 1);
        company.getCeo().hireManager(fenm1);

        AbstractEmployee employee = new Employee("Garek Majęcki", 25000);
        fenm1.hireEmployee((Employee) employee);
        fenm1.hireEmployee(new Employee("Jan", 12));
        fbm1.hireEmployee(new Employee("Sara", 123123));
        fbm2.hireEmployee(new Employee("Alan", 11122));


        assertEquals(company.getName() + "\n\t" + company.getCeo().getName() + " - CEO\n\t\t" + fbm1.getName() + " - Manager\n\t\t" + fbm2.getName() + " - Manager\n\t\t\tAlan - Employee\n\t\t" + fenm1.getName() + " - Manager\n\t\t\t" + employee.getName() + " - Employee\n", company.toString());
    }

}
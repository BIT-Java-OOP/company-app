package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompanyTest {
    @Test
    void shouldhHreNewCeo() {

        CEO newCeo = new CEO("Adam");
        CEO oldCeo;
        oldCeo = new CEO("Ala",
                Arrays.asList(new FixedBudgetManager("A", 1, 1),
                        new FixedEmployeeNumberManager("B", 2, 2)));
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
        FixedBudgetManager budgetMangerOne = new FixedBudgetManager("Adam_budget ", 3000, 900);
        company.getCeo().hireManager(budgetMangerOne);
        FixedBudgetManager budgetMangerTwo = new FixedBudgetManager("Ela_budget ", 30800, 77900);
        company.getCeo().hireManager(budgetMangerTwo);
        FixedEmployeeNumberManager limitMangerOne = new FixedEmployeeNumberManager("Kasia_limit", 2000, 1);
        company.getCeo().hireManager(limitMangerOne);

        AbstractEmployee employee = new Employee("Garek Majęcki", 25000);
        limitMangerOne.hireEmployeeIfPossible((Employee) employee);
        limitMangerOne.hireEmployeeIfPossible(new Employee("Jan", 12));
        budgetMangerOne.hireEmployeeIfPossible(new Employee("Sara", 123123));
        budgetMangerTwo.hireEmployeeIfPossible(new Employee("Alan", 11122));


        assertEquals(company.getName()
                + "\n\t" + company.getCeo().getName()
                + " - CEO\n\t\t" + budgetMangerOne.getName()
                + " - Manager\n\t\t" + budgetMangerTwo.getName()
                + " - Manager\n\t\t\tAlan - Employee\n\t\t" + limitMangerOne.getName()
                + " - Manager\n\t\t\t" + employee.getName()
                + " - Employee\n", company.toString());
    }

}
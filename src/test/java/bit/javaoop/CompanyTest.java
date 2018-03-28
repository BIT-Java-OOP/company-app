package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompanyTest {
    @Test
    void shouldhHireNewCeo() {
        //given
        CEO newCeo = new CEO("Adam");
        CEO oldCeo;
        //when
        oldCeo = new CEO("Ala",
                Arrays.asList(new FixedBudgetManager("A", 1, 1),
                        new FixedEmployeeNumberManager("B", 2, 2)));
        List<Manager> oldList = oldCeo.getManagersList();
        Company company = new Company("C", oldCeo);
        company.hireNewCeo(newCeo);
        //then
        assertEquals("Adam", company.getCeo().getName());
        assertEquals(oldList, company.getCeo().getManagersList());


    }

    @Test
    void shouldDoToString() {
        //given
        CEO oldCeo = new CEO("Zuza");
        Company company = new Company("CCC",oldCeo);
        company.hireNewCeo(new CEO("Adam"));
        FixedBudgetManager budgetMangerOne = new FixedBudgetManager("Adam_budget ", 3000, 900);
        FixedBudgetManager budgetMangerTwo = new FixedBudgetManager("Ela_budget ", 30800, 77900);
        FixedEmployeeNumberManager limitMangerOne = new FixedEmployeeNumberManager("Kasia_limit", 2000, 1);
        AbstractEmployee employee = new Employee("Garek Majęcki", 25000);

        //when
        company.getCeo().hireManager(budgetMangerOne);
        company.getCeo().hireManager(budgetMangerTwo);
        company.getCeo().hireManager(limitMangerOne);
        limitMangerOne.hireEmployeeIfPossible((Employee) employee);
        limitMangerOne.hireEmployeeIfPossible(new Employee("Jan", 12));
        budgetMangerOne.hireEmployeeIfPossible(new Employee("Sara", 123123));
        budgetMangerTwo.hireEmployeeIfPossible(new Employee("Alan", 11122));

        //then
        assertEquals(company.getName()
                + "\n\t" + company.getCeo().getName()
                + " - CEO\n\t\t" + budgetMangerOne.getName()
                + " - Manager\n\t\t" + budgetMangerTwo.getName()
                + " - Manager\n\t\t\tAlan - Employee\n\t\t" + limitMangerOne.getName()
                + " - Manager\n\t\t\t" + employee.getName()
                + " - Employee\n", company.toString());
    }

}
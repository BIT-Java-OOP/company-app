package bit.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void shouldGiveCorrectCompanyHierarchy() {
        //given
        Ceo ceo = new Ceo("Tomasz");

        AbstractManager fixedBudgetManager = new FixedBudgetManager("Andrzej",40_000,20_000);
        AbstractManager fixedEmployeeNumberManager = new FixedEmployeeNumberManager("Ania",40_000,5);

        fixedBudgetManager.addEmployee(
                new Employee("Arnold", 10_000)
        );
        fixedBudgetManager.addEmployee(
                new Employee("Wojciech", 10_000)
        );
        fixedBudgetManager.addEmployee(
                new Employee("Julia", 10_000)
        );

        fixedEmployeeNumberManager.addEmployee(
                new Employee("Kasia", 20_000)
        );
        fixedEmployeeNumberManager.addEmployee(
                new Employee("Basia", 20_000)
        );
        fixedEmployeeNumberManager.addEmployee(
                new Employee("Aleksander", 20_000)
        );

        ceo.addManager(fixedBudgetManager);
        ceo.addManager(fixedEmployeeNumberManager);

        Company company = new Company("Kompania Braci", ceo);

        //when
        String result = company.toString();

        //then
        assertEquals(getResultPattern(), result);


    }

    private String getResultPattern() {
        StringBuilder resultPattern = new StringBuilder();
        resultPattern.append("Tomasz - CEO\n");
        resultPattern.append("\tAndrzej - Manager\n");
        resultPattern.append("\t\tArnold - Employee\n");
        resultPattern.append("\t\tWojciech - Employee\n");
        resultPattern.append("\t\tJulia - Employee\n");

        resultPattern.append("\tAnia - Manager\n");
        resultPattern.append("\t\tKasia - Employee\n");
        resultPattern.append("\t\tBasia - Employee\n");
        resultPattern.append("\t\tAleksander - Employee\n");

        return resultPattern.toString();
    }

}
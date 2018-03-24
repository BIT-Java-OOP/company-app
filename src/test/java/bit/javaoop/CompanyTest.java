package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void toStringTest() {
        //given
        Company company = Company.getInstance();
        ISubordinate worker1 = new Employee("Alice",1500);
        BudgetManager manager1 = new BudgetManager("Mark",20_000,20_000);
        NumberManager manager2 = new NumberManager("Mark",20_000,2);
        CEO ceo = new CEO("Bob");
        //when
        company.setName("JavaOOP");
        company.hireNewCEO(ceo);
        manager1.hireSubordinate(worker1);
        manager2.hireSubordinate(worker1);
        ceo.hireSubordinate(manager1);
        ceo.hireSubordinate(manager2);
        //then

        assertEquals("-- Company JavaOOP --\n"+"" +
                "Bob - CEO\n"+
                "\tMark - BudgetManager\n"+
                "\t\tAlice - Employee\n"+
                "\tMark - NumberManager\n"+
                "\t\tAlice - Employee\n",company.toString());
    }
}
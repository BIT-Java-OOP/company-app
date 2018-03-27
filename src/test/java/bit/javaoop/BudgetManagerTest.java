package bit.javaoop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BudgetManagerTest {
    private Manager manager1,manager2;
    @BeforeEach
    void setUp(){
        manager1=new FixedBudgedManager("",15001,20001);
        manager2=new FixedBudgedManager("",22001,20001);

    }
    @Test
    void shouldHireEmployee(){
        //given
        AbstractEmployee e1=new Employee("",100);
        AbstractEmployee e2=new Employee("",2_000);
        AbstractEmployee e3=new Employee("",20_000);
        //when
        manager1.hire(e1);
        manager1.hire(e2);
        manager2.hire(e1);
        manager2.hire(e2);
        manager2.hire(e3);
        //then
        assertEquals(2,manager1.getEmployees_list().size());
        assertEquals(2,manager2.getEmployees_list().size());
    }
    @Test
    void shouldCouldHaveHiredEmployee(){
        //given
        AbstractEmployee e1=new Employee("",100);
        AbstractEmployee e2=new Employee("",2_000);
        AbstractEmployee e3=new Employee("",20_000);
        //when
        manager1.hire(e1);
        manager2.hire(e1);
        manager2.hire(e2);
        //then
        assertEquals(true,manager1.canHire(e2));
        assertEquals(false,manager2.canHire(e3));
    }
    @Test
    void shouldBeSatisfied(){
        //given
        Manager manager3=new FixedBudgedManager("",22001,1499);
        Manager manager4=new FixedBudgedManager("",12001,1499);
        //when
        //then
        assertEquals(false,manager1.isSatisfied());
        assertEquals(false,manager2.isSatisfied());
        assertEquals(true,manager3.isSatisfied());
        assertEquals(false,manager4.isSatisfied());
    }
}

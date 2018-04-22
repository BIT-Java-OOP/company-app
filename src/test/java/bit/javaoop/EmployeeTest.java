package bit.javaoop;

import bit.javaoop.calculator.AnnualSalary;
import bit.javaoop.calculator.BonusToSalary;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.policy.EmploymentContract;
import bit.javaoop.policy.PolicyB2B;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void shouldBeSatisfied() {

        //given
        AbstractEmployee richEmployee = new Employee("Rose", 50_000, new AnnualSalary(), new PolicyB2B());

        //when
        boolean result = richEmployee.isSatisfied();

        //then
        assertTrue(result);
    }

    @Test
    void shouldGetAnnualSalary(){
        //given
        double salary = 10_000;
        AbstractEmployee employee2 = new Employee("John", salary, new AnnualSalary(), new EmploymentContract());

        //when
        double annualSalary = employee2.getSalary();

        //then
        assertTrue(annualSalary == salary);
    }

    @Test
    void shouldGetBonusToSalary() {
        //given
        double salary = 10_000;
        AbstractEmployee employee2 = new Employee("Johnny", salary, new BonusToSalary(), new PolicyB2B());

        //when
        double bonusToSalary = employee2.getSalary();

        //then
        assertTrue(bonusToSalary == salary);
    }
}
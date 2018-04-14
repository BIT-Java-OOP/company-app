package bit.javaoop;

import bit.javaoop.calculator.GrossSalaryCalculator;
import bit.javaoop.calculator.NetRevenueCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.employment.B2B;
import bit.javaoop.employment.EmploymentContract;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void shouldBeSatisfied() {

        //given
        AbstractEmployee highSalaryEmployee = new Employee("Bogaty pracownik", 50_000, new GrossSalaryCalculator(), new B2B());

        //when
        boolean result = highSalaryEmployee.isSatisfied();

        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnGrossSalary() {

        //given
        final double SALARY = 20_000;
        AbstractEmployee employee = new Employee("Grażynka", SALARY, new GrossSalaryCalculator(), new EmploymentContract());

        //when
        double grossSalary = employee.getSalary();

        //then
        assertTrue(grossSalary == SALARY);
    }

    @Test
    void shouldReturnNetRevenue() {

        //given
        final double GROSS_SALARY = 20_000;
        final double NET_REVENUE = 14_000;
        AbstractEmployee employee = new Employee("Adaś", GROSS_SALARY, new NetRevenueCalculator(), new B2B());

        //when
        double netRevenue = employee.getSalary();

        //then
        assertTrue(netRevenue == NET_REVENUE);
    }


    @Test
    void shouldNotBeSatisfied() {

        //given
        AbstractEmployee highSalaryEmployee = new Employee("Biedny pracownik", 3_000, new GrossSalaryCalculator(), new B2B());

        //when
        boolean result = highSalaryEmployee.isSatisfied();

        //then
        assertTrue(!result);
    }


}

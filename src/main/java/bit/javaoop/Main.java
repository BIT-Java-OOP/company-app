package bit.javaoop;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    public static void main(String args[])
    {
        AbstractEmployee fixed = new FixedEmployeeNumberManager("Anna", 25_000f);
        AbstractEmployee employee = new Employee("Jozef", 5_000f);
        AbstractEmployee manager = new FixedEmployeeNumberManager("Jack", 5_000f);
        fixed.addEmployee(employee);
        //when
        boolean added = fixed.getEmployeeList().isEmpty();
        Company company = new Company();
        company.hireCEO();
        company.setCompanyName("JavaOPP");
        System.out.println(company.toString());
        //then
    }
}

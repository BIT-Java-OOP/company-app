package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("Garek Majęcki", 25_000);

        System.out.println(employee.getName() + " " + employee.getSalary());

        Company company = new Company("Company");
        CEO ceo = new CEO("Zbyszek");
        AbstractManager m1 = new FixedBudgetManager("Maciek", 50000, 800000);
        AbstractEmployee e1 = new Employee("Wacek", 1000);
        AbstractEmployee e2 = new Employee("Leszek", 2800);
        AbstractEmployee e3 = new Employee("Grzesiek", 3600);
        m1.hireEmployee(e1);
        m1.hireEmployee(e2);
        m1.hireEmployee(e3);
        ceo.addManager(m1);
        AbstractManager m2 = new FixedEmployeeManager("Krzysiek", 70000, 7);
        AbstractEmployee e4 = new Employee("Frodo", 8000);
        m2.hireEmployee(e4);
        ceo.addManager(m2);
        company.hireCEO(ceo);

        System.out.println(company);
    }

}

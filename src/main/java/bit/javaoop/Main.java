package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marek", 5_000);
        Employee employee2 = new Employee("Kuba", 10_000);
        Employee employee3 = new Employee("Ania", 15_000);
        Employee employee4 = new Employee("Szymon", 20_000);

        AbstractManager manager1 = new FixedBudgetManager("Jan", 25_000, 20_000);
        AbstractManager manager2 = new FixedEmployeeNumberManager("Pawel", 30_000, 2);

        CEO ceo = new CEO("Krzysiek");
        Company company = new Company("EasySoft");

        company.hireCEO(ceo);

        ceo.hireManager(manager1);
        ceo.hireManager(manager2);

        manager1.hireIfPossible(employee1);
        manager1.hireIfPossible(employee2);

        manager2.hireIfPossible(employee3);
        manager2.hireIfPossible(employee4);

        System.out.println(company.toString());
    }

}

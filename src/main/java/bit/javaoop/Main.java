package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Marek", 5_000);
        Employee employee_2 = new Employee("Kuba", 10_000);
        Employee employee_3 = new Employee("Ania", 15_000);
        Employee employee_4 = new Employee("Szymon", 20_000);

        AbstractManager manager_1 = new FixedBudgetManager("Jan", 25_000, 20_000);
        AbstractManager manager_2 = new FixedEmployeeNumberManager("Pawel", 30_000, 2);

        CEO ceo = new CEO("Krzysiek");
        Company company = new Company("EasySoft");

        company.hireCEO(ceo);

        ceo.hireManagerToList(manager_1);
        ceo.hireManagerToList(manager_2);

        manager_1.hire(employee_1);
        manager_1.hire(employee_2);

        manager_2.hire(employee_3);
        manager_2.hire(employee_4);

        System.out.println(company.toString());
    }

}

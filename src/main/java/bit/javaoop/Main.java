package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee1 = new Employee("Stefan Banach", 25_000);
        AbstractEmployee employee2 = new Employee("Marek Kac", 10_000);
        AbstractEmployee employee3 = new Employee("Stanisław Mazur", 15_000);
        AbstractManager manager1 = new FixedBudgetManager("Hugo Steinhaus", 20_000,30_000);
        AbstractManager manager2 = new FixedEmployeesManager("Stanisław Ulam", 20_000,30);
        manager1.hire(employee1);
        manager2.hire(employee2);
        manager2.hire(employee3);
        CEO ceo1 = new CEO("John von Neumann");
        ceo1.getManagers().add(manager1);
        ceo1.getManagers().add(manager2);
        Company company1 = new Company();
        company1.setCeo(ceo1);
        System.out.println(company1);
    }

}

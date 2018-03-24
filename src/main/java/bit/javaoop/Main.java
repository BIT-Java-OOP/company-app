package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        company.setName("JavaOOP");
        ISubordinate worker1 = new Employee("Alice",1500);
        ISubordinate  worker2 = new Employee("John",2500);
        ISubordinate  worker3 = new Employee("Jacob",5500);

        BudgetManager manager1 = new BudgetManager("Mark",20_000,20_000);
        manager1.hireSubordinate(worker1);
        manager1.hireSubordinate(worker2);
        manager1.hireSubordinate(worker3);
        CEO ceo = new CEO("Bob");
        ceo.hireSubordinate(manager1);

        company.hireNewCEO(ceo);
        NumberManager manager2 = new NumberManager("Mark",20_000,2);
        ceo.hireSubordinate(manager2);
        manager2.hireSubordinate(worker1);
        manager2.hireSubordinate(worker2);
        manager2.hireSubordinate(worker3);
        System.out.println(company.toString());
    }

}

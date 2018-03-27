package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("Anton", 15_000);
        AbstractEmployee employee1 = new Employee("Pyotr", 5_000);
        AbstractEmployee employee2 = new Employee("Alexei", 5_000);
        AbstractEmployee employee3 = new Employee("Sergey", 2_000);
        CEO sio = new CEO("Vlad");
        Company Korp = new Company("Kopro", sio);
        Manager manager1 = new FixedBudgedManager("Wojtek", 26524, 18885);
        Manager manager2 = new FixedEmployeeNumberManager("Krzysztof", 29523, 4);
        manager1.hire(employee1);
        manager2.hire(employee2);
        manager1.hire(employee3);
        manager2.hire(employee);
        sio.addManager(manager1);
        sio.addManager(manager2);
        System.out.println(Korp);

    }

}

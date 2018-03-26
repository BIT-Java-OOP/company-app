package bit.javaoop;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        CEO ceoOfKompany = new CEO("Ziemek Stefczyk",new LinkedList<>());

        Company Kompany = new Company("Kompany", ceoOfKompany);


        AbstractEmployee employee1 = new Employee("Garek Majęcki", 2_000);
        AbstractEmployee employee2 = new Employee("Zosia", 1_000);
        AbstractEmployee employee3 = new Employee("Janek", 5_000);
        AbstractEmployee employee4 = new Employee("Jagoda", 4_200);

        Manager manager1 = new FixedBudgetManager("Kasia Majęcka", 10_000, 14_000,new LinkedList<>());
        Manager manager2 = new FixedEmployeeNumberManager("Zenek Kapała", 15_000, 10,new LinkedList<>());

        manager1.hire(employee1);
        manager1.hire(employee2);

        manager2.hire(employee3);
        manager2.hire(employee4);

        ceoOfKompany.hireAManager(manager1);
        ceoOfKompany.hireAManager(manager2);

        System.out.println(Kompany.toString());

    }

}

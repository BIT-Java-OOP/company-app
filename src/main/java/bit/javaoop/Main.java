package bit.javaoop;

public class Main {
    public static void main(String[] args) {

        CEO ceoOfKompany = new CEO("Ziemek Stefczyk");

        Company Kompany = new Company("Kompany", ceoOfKompany);


        AbstractEmployee employee1 = new Employee("Garek Majęcki", 2_000);
        AbstractEmployee employee2 = new Employee("Zosia", 1_000);
        AbstractEmployee employee3 = new Employee("Janek", 5_000);
        AbstractEmployee employee4 = new Employee("Jagoda", 4_200);

        Menager menager1 = new FixedBudgetMenager("Kasia Majęcka",10_000,14_000);
        Menager menager2 = new FixedEmployeeNumberMenager("Zenek Kapała",15_000,10);

        menager1.hire(employee1);
        menager1.hire(employee2);

        menager2.hire(employee3);
        menager2.hire(employee4);

        ceoOfKompany.hireAMenager(menager1);
        ceoOfKompany.hireAMenager(menager2);

        System.out.println(Kompany.toString());

    }

}

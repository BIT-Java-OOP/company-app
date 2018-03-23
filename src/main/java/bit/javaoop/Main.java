package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company("Wadowicka Kanciapa z Kremowkami");
        CEO myPrezes = new CEO("Warol Kojtyla");
        Manager m1 = new FixedBudgetManager("Franciszek", 13_000, 10_000);
        Manager m2 = new FixedEmployeeNumberManager("Benedykt", 16_000, 3);
        Employee e1 = new Employee("Natan", 1_600);
        Employee e2 = new Employee("Rydzu", 2_800);
        Employee e3 = new Employee("Trojan", 3_200);
        Employee e4 = new Employee("Dziwiszon", 3_600);
        Employee e5 = new Employee("Bogdan", 4_400);
        Employee e6 = new Employee("Lucyfer", 6_600);

        myCompany.hireCEO(myPrezes);
        myPrezes.hireManager(m1);
        myPrezes.hireManager(m2);
        if (m1.canHire(e1)) m1.hireEmployee(e1);
        if (m1.canHire(e2)) m1.hireEmployee(e2);
        if (m1.canHire(e3)) m1.hireEmployee(e3);
        if (m2.canHire(e4)) m2.hireEmployee(e4);
        if (m2.canHire(e5)) m2.hireEmployee(e5);
        if (m2.canHire(e6)) m2.hireEmployee(e6);

        String res;
        res = myCompany.toString();
    }
}

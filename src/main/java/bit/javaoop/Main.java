package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO("Staszek");
        Manager m1 = new FixedBudgetManager("Wiesiek", 30000);
        Manager m2 = new FixedEmploeeNumberManager("Romek", 20000);
        Employee e1 = new Employee("Mirek", 2000);
        if(m1.canHire(e1)) m1.hire(e1);
        ceo.addManager(m1).addManager(m2);
        Company company = new Company(ceo, "firma");
        System.out.println(company.toString());

    }
}

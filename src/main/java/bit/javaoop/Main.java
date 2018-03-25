package bit.javaoop;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("CCC");
        company.hireNewCeo(new CEO("Adam"));
        FixedBudgetManager fbm1 = new FixedBudgetManager("Adam_budget ", 3000, 900);
        company.getCeo().hireManager(fbm1);
        FixedBudgetManager fbm2 = new FixedBudgetManager("Ela_budget ", 30800, 77900);
        company.getCeo().hireManager(fbm2);
        FixedEmployeeNumberManager fenm1 = new FixedEmployeeNumberManager("Kasia_limit", 2000, 1);
        company.getCeo().hireManager(fenm1);

        AbstractEmployee employee = new Employee("Garek Majęcki", 25000);
        fenm1.hireEmployee((Employee) employee);
        fenm1.hireEmployee(new Employee("Jan", 12));
        fbm1.hireEmployee(new Employee("Sara", 123123));
        fbm2.hireEmployee(new Employee("Alan", 11122));


        System.out.println(company.toString());

    }

}

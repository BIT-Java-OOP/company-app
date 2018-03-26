package bit.javaoop;

public class Main {
    public static void main(String[] args) {
       Company company= new Company("SuperHiperCompanyMojeKompany");
       CEO ceo=new CEO("Zbyszek");
       AbstractManager manager1=new FixedBudgetManager("Maciek", 9999999.99, 2000000);
       ceo.addMenager(manager1);
        AbstractManager manager2=new FixedEmployeeNumberManager("Krzysiek", 0.99,10);
        ceo.addMenager(manager2);

        AbstractEmployee employee1= new Employee("Wacek", 25);
        manager1.hire(employee1);
        AbstractEmployee employee2= new Employee("Leszek", 25000);
        manager1.hire(employee2);
        AbstractEmployee employee3= new Employee("Frodo", 1500);
        manager2.hire(employee3);

        company.hireCEO(ceo);
        System.out.println(company);
    }

}

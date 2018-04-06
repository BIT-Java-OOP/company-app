package bit.javaoop;


public class Main {
    public static void main(String args[])
    {
        Company company = Company.getInstance();
        company.setCompanyName("JavaOOP");
        Inferior worker1 = new Employee("Janek",2500f);
        Inferior worker2 = new Employee("Anna",5500f);
        Inferior worker3 = new Employee("Zuza",8000f);

        FixedBudgetManager manager1 = new FixedBudgetManager("Janina",20_000f);
        manager1.addEmployee(worker1);
        manager1.addEmployee(worker2);
        manager1.addEmployee(worker3);
        CEO ceo = new CEO("Stefan");
        ceo.addEmployee(manager1);

        company.hireCEO(ceo);
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("Emil",20_000f);
        ceo.addEmployee(manager2);
        manager2.addEmployee(worker1);
        manager2.addEmployee(worker3);
        System.out.println(company.toString());
        System.out.println(manager1.getActualSalary());
    }
}

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
        manager1.shouldAddEmployee(worker1);
        manager1.shouldAddEmployee(worker2);
        manager1.shouldAddEmployee(worker3);
        CEO ceo = new CEO("Stefan");
        ceo.shouldAddEmployee(manager1);

        company.shouldHireCEO(ceo);
        ceo.setName("Ola");
        FixedEmployeeNumberManager manager2 = new FixedEmployeeNumberManager("Emil",20_000f);
        ceo.shouldAddEmployee(manager2);
        manager2.shouldAddEmployee(worker1);
        manager2.shouldAddEmployee(worker3);
        System.out.println(company.toString());
        System.out.println(manager1.getActualSalary());
    }
}

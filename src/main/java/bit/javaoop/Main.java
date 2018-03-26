package bit.javaoop;

public class Main {

    public static void main(String[] args) {
        Ceo ceo1 = new Ceo("Mieciu");
        Company company = new Company("Ejpl");
        AbstractEmployee employee1 = new Employee("Cześć tu Sławomir", 25_000, company);

        company.printEmployeeName(employee1);
        company.printEmployeeSalary(employee1);

        AbstractEmployee employee2 = new Employee("Trump", 15_000, company);
        AbstractEmployee employee3 = new Employee("Juliusz Cezar", 30_000, company);
        AbstractManager manager1 = new BudgetManager("Ferdek Kiepski", 25_000, 50_000, company);


        company.printIfEmployeeIsSatisfied(manager1);
        company.printIfManagerCanHireEmployee(manager1, employee1);
        company.makeManagerHireEmployee(manager1, employee1);
        company.printIfEmployeeIsSatisfied(manager1);
        company.printIfManagerCanHireEmployee(manager1, employee2);
        company.makeManagerHireEmployee(manager1, employee2);
        company.printIfEmployeeIsSatisfied(manager1);
        company.printIfManagerCanHireEmployee(manager1, employee3);
        company.makeManagerHireEmployee(manager1, employee3);
        company.printIfEmployeeIsSatisfied(manager1);

        company.setCeo(ceo1);
        Ceo ceo2 = new Ceo("Zenek Martyniuk");
        company.setCeo(ceo2);


        System.out.println(company.toString());

        Company company2 = new Company("An druid");
        AbstractEmployee employee4 = new Employee("Fck Ejpl", 30_000, company2);
        AbstractManager manager2 = new EmployeeNumberManager("Kaczor", 25_000, company2, 2);
        company.printIfEmployeeIsSatisfied(employee4);
        company2.printIfEmployeeIsSatisfied(employee4);

        System.out.println(company2.toString());
    }


}

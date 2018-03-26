package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Employee marian= new Employee("marian", 2000);
        Employee zbyszek= new Employee("zbyszek", 20000);
        Employee wacek= new Employee("wacek", 12000);

        Manager budgetManager = new BudgetManager("jan",21000,20000);
        Manager employeeNumberManager = new EmployeeNumberManager("maks",17000, 1);

        CEO ceo = new CEO("steve", 2000000);
        CEO ceo2 = new CEO("majkel",20000);

        Company company = new Company("alibaba", ceo);

        ceo.addManager(budgetManager);
        ceo.addManager(employeeNumberManager);

        budgetManager.hireNewEmployee(marian);
        budgetManager.hireNewEmployee(zbyszek);
        budgetManager.hireNewEmployee(wacek);

        employeeNumberManager.hireNewEmployee(zbyszek);
        employeeNumberManager.hireNewEmployee(wacek);

        System.out.println(company.toString());

        company.hireNewCeo(ceo2);

        System.out.println(company.toString());
    }

}

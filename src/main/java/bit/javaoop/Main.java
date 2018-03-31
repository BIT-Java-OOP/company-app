package bit.javaoop;

public class Main {
    public static void main(String[] args) {

        CEO ceo = new CEO("Zbyszek", 50_000);
        Manager budgetManager = new BudgetManager("Maciek", 30_000, 30_000);
        Manager employeeNumberManager = new EmployeeNumberManager("Krzysiek", 18_000, 2);
        Employee standardEmployee = new Employee("Wacek", 5_100);
        Employee standardEmployee2 = new Employee("Leszek", 3_000);
        Employee standardEmployee3 = new Employee("Grzesiek", 2_500);
        Employee standardEmployee4 = new Employee("Frodo", 2_500);
        Company company = new Company("New company", ceo);

        ceo.addManager(budgetManager);
        ceo.addManager(employeeNumberManager);
        budgetManager.hire(standardEmployee);
        budgetManager.hire(standardEmployee2);
        budgetManager.hire(standardEmployee3);
        employeeNumberManager.hire(standardEmployee4);

        System.out.println(company.toString());
    }
}

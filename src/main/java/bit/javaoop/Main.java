package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Wacek", 25_000);
        Employee employee2 = new Employee("Leszek", 5_000);
        Employee employee3 = new Employee("Grzesiek", 15_000);
        Employee employee4 = new Employee("Frodo", 11_000);

        FixedEmployeeNumberManager manager_quantity = new FixedEmployeeNumberManager("Maciek", 30_000);
        manager_quantity.setEmployeeLimit(2);
        FixedBudgetManager manager_budget = new FixedBudgetManager("Krzysiek", 13_000);
        manager_budget.setFixedBudget(200_000);

        CEO boss = new CEO("Zbyszek");

        Company corpo = new Company("Java Object Oriented Programming", boss);


        employee1.answerQuestions();

        boss.hireManager(manager_budget);
        boss.hireManager(manager_quantity);
        manager_budget.hireNewEmployee(employee1);
        manager_budget.hireNewEmployee(employee2);
        manager_budget.hireNewEmployee(employee3);
        manager_quantity.hireNewEmployee(employee4);

        System.out.println(corpo.toString());


    }

}

package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("Garek Majęcki", 25_000);
        BudgetsetBudget(25_000);
        System.out.println(employee.getName() + " " + employee.getSalary());
    }

}

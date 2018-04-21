package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        Company company;
        company = new Company("THICC");

        AbstractEmployee employee = new Employee("Wacek", 8_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        AbstractEmployee employee3 = new Employee("Leszek", 7_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        AbstractEmployee employee4 = new Employee("Frodo", 7_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy());
        AbstractManager manager1 = new FixedBudgetManager("Grzesiek", 25_000,  new WorstSalaryCalculator(), new NormalEmploymentPolicy(), 100_000);
        AbstractManager manager2 = new FixedBudgetManager("Maciek", 25_000,  new WorstSalaryCalculator(), new NormalEmploymentPolicy(), 100_000);
        AbstractManager manager3 = new FixedEmployeeNumberManager("Krzysiek", 19_000, new WorstSalaryCalculator(), new NormalEmploymentPolicy(),2);

        CEO ceo_1 = new CEO("Zbyszek", new NiceSalaryCalculator(), new NormalEmploymentPolicy());

        company.hireNewCeo(ceo_1);
        ceo_1.addManager(manager2);
        ceo_1.addManager(manager1);
        ceo_1.addManager(manager3);
        manager2.hire(employee);
        manager2.hire(employee3);
        manager3.hire(employee4);
        company.toStream();
    }

}

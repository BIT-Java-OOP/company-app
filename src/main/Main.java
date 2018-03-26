

public class Main {
    public static void main(String[] args) {

        Company c = new Company("abb", new CEO("Jacek"));
        Employee employee = new Employee("Arek", 250000.0);
        FixedBudgetManager manager = new FixedBudgetManager("Pawel", 20000.0, 400000.0);
        if(manager.canHire()){
            manager.hire( employee);
        }

        c.addManager(manager);
        c.addEmployee(manager, new Employee("Wojtek", 1500.0));


        Manager m2 = new FixedEmployeeNumberManager("Mateusz", 40000.0);
        c.addManager(m2);
        c.addEmployee(m2, new Employee("Bartek", 3000.0));


        c.display();
    }



}

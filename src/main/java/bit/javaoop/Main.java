package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        ///AbstractEmployee employee = new Employee("Garek Majęcki", 25_000);
        ///System.out.println(employee.getName() + " " + employee.getSalary());

        FixedBudgetManager Dybczak = new FixedBudgetManager("Dybczaq", 25000, 0,10000);
       /*
        System.out.println(Dybczak.getName() + " " + Dybczak.getSalary());
        System.out.println(Dybczak.canBeHired());
        */
        Employee man = new Employee("Testoviron", 5);
        Dybczak.addEmployee(man);
        Employee manp = new Employee("Testoviron", 500000); /// nie zatrudni bo nie moze, za duze salary
        Dybczak.addEmployee(manp);
        //System.out.println(Dybczak.getTab()[0].getName()+" "+Dybczak.getCounter());

        System.out.println(Dybczak.getSumOfAllEmployeesSalaries());
        System.out.println(Dybczak.isSatisfied());

        FixedEmployeeNumberManager Jan = new FixedEmployeeNumberManager("Jan",1000,0,1); // employeers == limit pracownikow
        Employee Jakub = new Employee("Jakub",20000);
        Jan.addEmployee(Jakub);
        System.out.println(Jan.canBeHired());

        CEO Kubicz = new CEO("Piotr");
        Kubicz.addManager(Jan);

        System.out.println(Kubicz);
    }
}
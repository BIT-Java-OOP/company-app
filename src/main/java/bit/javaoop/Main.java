package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        /*AbstractEmployee employee = new Employee("Dakub Jybczak", 1500);
        System.out.println(employee.getName() + "    " + employee.getSalary());
        System.out.println(employee.isSatisfied());
        employee.setName("Jakub");
        System.out.println(employee.getName());*/
        Employee emp = new Employee("Wacek",3000);
        Employee emp1 = new Employee("Leszek",3500);
        Employee emp2 = new Employee("Frodo",2500);
        Manager man = new Manager("Grzesiek",4000,0);

        FixedBudgetManager fbm = new FixedBudgetManager("Maciek",6000, 0,10000);

        fbm.addEmployee(emp);
        fbm.addEmployee(emp1);
        /*System.out.println(fbm.getTab()[0].getName()+"  "+fbm.getCounter());
        System.out.println(fbm);
        System.out.println(fbm.isSatisfied());*/
        FixedEmployeeNumberManager fenm = new FixedEmployeeNumberManager("Krzysiek",28000,0,1);
        /*System.out.println(fenm.canHire());
        System.out.println(fenm.isSatisfied());*/
        CEO ceo = new CEO ("Zbyszek ");
        ceo.addManager(fbm);
        ceo.addManager(fenm);
        ceo.addManager(man);
        fenm.addEmployee(emp2);
        System.out.println();
       // for (int i=0; i<ceo.getCounter();i++)
          //  System.out.println(ceo.getTab()[i].getName());
        System.out.println(ceo);
    }
}

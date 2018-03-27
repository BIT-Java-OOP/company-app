package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        //AbstractEmployee employee = new Employee("Garek Majęcki", 25_000);

        //System.out.println(employee.getName() + " " + employee.getSalary());

        CEO ceo = new CEO("Big Boss", 100_000);
        Manager man1 = new Manager("Frank", 25_000);
        Manager man2 = new Manager("Leo", 20_000);
        Manager man3 = new Manager("Travis", 19_000);
        ceo.AddToManagers(man1);
        ceo.AddToManagers(man2);
        ceo.AddToManagers(man3);
        Employee emp1 = new Employee("Littlefinger", 14_000);
        Employee emp2 = new Employee("Frodo", 11_000);
        Employee emp3 = new Employee("Bilbo", 10_000);
        Employee emp4 = new Employee("Zoltan", 9000);
        Employee emp5 = new Employee("Andrzej", 8000);
        Employee emp6 = new Employee("Janusz", 10_000);
        man1.Hire(emp1);
        man1.Hire(emp4);
        man2.Hire(emp2);
        man3.Hire(emp3);
        man2.Hire(emp6);
        man3.Hire(emp5);
        Company comp = new Company("IncrediblyAwesomeJavaCompany", ceo);
        comp.toString();
    }
}

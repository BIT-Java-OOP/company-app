package bit.javaoop;

import bit.javaoop.people.AbstractEmployee;
import bit.javaoop.people.Employee;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("Garek Majęcki", 25_000);

        System.out.println(employee.getName() + " " + employee.getSalary());
    }

}

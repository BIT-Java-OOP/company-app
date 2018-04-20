package bit.javaoop;

import bit.javaoop.calculator.GrossSalaryCalculator;
import bit.javaoop.calculator.NetRevenueCalculator;
import bit.javaoop.company.AbstractEmployee;
import bit.javaoop.company.Employee;
import bit.javaoop.company.manager.AbstractManager;
import bit.javaoop.company.manager.CEO;
import bit.javaoop.company.manager.FixedBudgetManager;
import bit.javaoop.company.manager.FixedEmployeeNumberManager;
import bit.javaoop.employment.B2B;
import bit.javaoop.employment.EmploymentContract;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        CEO ceoOfKompany = new CEO("Ziemek Stefczyk", new LinkedList<>());

        Company Kompany = new Company("Kompany", ceoOfKompany);


        AbstractEmployee employee1 = new Employee("Garek Majęcki", 2_000, new NetRevenueCalculator(), new B2B());
        AbstractEmployee employee2 = new Employee("Zosia", 11_000, new GrossSalaryCalculator(), new EmploymentContract());
        AbstractEmployee employee3 = new Employee("Janek", 5_000, new NetRevenueCalculator(), new EmploymentContract());
        AbstractEmployee employee4 = new Employee("Jagoda", 5_200, new GrossSalaryCalculator(), new B2B());


        AbstractManager manager1 = new FixedBudgetManager("Kasia Majęcka", 10_000, new GrossSalaryCalculator(), new EmploymentContract(), new ArrayList<>(), 14_000);
        AbstractManager manager2 = new FixedEmployeeNumberManager("Zenek Kapała", 15_000, new NetRevenueCalculator(), new EmploymentContract(), new ArrayList<>(), 10);

        if (manager1.hireIfPossible(employee1))
            System.out.println(employee1.getName() + " successfully hired by " + manager1.getName());
        if (manager1.hireIfPossible(employee2))
            System.out.println(employee2.getName() + " successfully hired by " + manager1.getName());

        if (manager2.hireIfPossible(employee3))
            System.out.println(employee3.getName() + " successfully hired by " + manager2.getName());
        if (manager2.hireIfPossible(employee4))
            System.out.println(employee4.getName() + " successfully hired by " + manager2.getName());

        ceoOfKompany.hireAManager(manager1);
        ceoOfKompany.hireAManager(manager2);

        System.out.println(Kompany.toString());

    }

}

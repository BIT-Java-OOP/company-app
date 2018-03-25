package bit.javaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractEmployee> EmployeeList = new ArrayList<>();

        Company company = new Company(new CEO("Ernest"), "MozeJestOk");

        FBManager Manager = new FBManager("Zygfryd", 25_000, EmployeeList, 50_000);
        Manager.CanHire(new Employee("Melchior", 15_000));
        Manager.CanHire(new Employee("Gilford", 25_000));
        Manager.CanHire(new Employee("Eustachy", 15_000));
        Manager.CanHire(new Employee("Joachim", 10_000));

        FEnManager Manager1 = new FEnManager("Gerwazy", 25_000, EmployeeList, 3);
        Manager1.CanHire(new Employee("Tadeusz", 15_000));
        Manager1.CanHire(new Employee("Romuald", 15_000));
        Manager1.CanHire(new Employee("Warcisław", 15_000));
        Manager1.CanHire(new Employee("Elrond", 10_000));

        company.hire(Manager);
        company.hire(Manager1);
        System.out.print(company.toString());

    }

}

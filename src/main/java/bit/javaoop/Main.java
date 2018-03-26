package bit.javaoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractEmployee> sampleEmployyeeList =new ArrayList<AbstractEmployee>();
        sampleEmployyeeList.add(new Employee("Marek",10000));
        sampleEmployyeeList.add(new Employee("Łukasz",3000));
        sampleEmployyeeList.add(new Employee("Jacek",10000));
        sampleEmployyeeList.add(new Employee("Mateusz",10000));

        Manager sampleManager = new Manager("Mirek",0,12_000,9);
        sampleManager.hire(new Employee("Szymon",3001));
        sampleManager.hire(new Employee("Paweł",3001));
        sampleManager.hire(new Employee("Jarosław",3001));
        sampleManager.hire(new Employee("Janusz",3001));

        Company comp = new Company(new CEO("Andrzej"),"SuperCorpo");
        comp.hire(new Employee("Stanisław",9_000));
        comp.hire(new Manager("Jacek",19_000,50_000,8,sampleEmployyeeList));
        comp.hire(new Manager("Piotrek",21_000,50_000,8,sampleEmployyeeList));
        comp.hire(new Employee("Krystian",10_000.001));
        comp.hire(sampleManager);

        System.out.print(comp.toString());
    }

}

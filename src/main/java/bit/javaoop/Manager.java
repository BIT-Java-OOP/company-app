package bit.javaoop;

import java.util.List;

public abstract class Manager extends AbstractEmployee {
    public List<Employee> listofEmployees;

    Manager(String name, double salary) {
        super(name, salary);

    }

    public abstract boolean CanHire(Employee employee);
    public void HireEmployee(Employee employee) {if(CanHire(employee)) listofEmployees.add(employee);}

    @Override
    public String toString() {
        String str="\t"+getName()+"- Manager \n";
            for(Employee e:listofEmployees) str+="\t"+e.toString();
        return str;
    }
}

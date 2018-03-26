package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee {
     private String name;
    private Float salary;
    private static List <AbstractEmployee> EmployeeList = new ArrayList<>();


    public AbstractEmployee(String name, Float salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public AbstractEmployee()
    {}

    public Float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


    abstract public boolean isSatisfied();
    abstract public void addEmployee(AbstractEmployee employee);
    abstract public String getPosition();

    public static List<AbstractEmployee> getEmployeeList() {
        return EmployeeList;
    }


}

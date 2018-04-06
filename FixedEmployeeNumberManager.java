package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class FixedEmployeeNumberManager extends AbstractEmployee implements Superior, Inferior,SalaryCalculator {
    private Integer limitEmployees = 10;
    private List<Inferior> inferiorList = new ArrayList<>();

    public FixedEmployeeNumberManager(String name, Float salary)
    {
        super(name,salary);
    }

    @Override
    public List<Inferior> getInferiors()
    {
        return inferiorList;
    }

    @Override
    public Float getActualSalary()
    {
        return getSalary();
    }

    private Integer getAmountOfEmployees()
    {
        Integer count=0;
        for(Inferior e: inferiorList)
        {
            count++;
        }
        return count;
    }


    private boolean canHire() {
        return limitEmployees > getAmountOfEmployees();
    }

    @Override
    public void addEmployee(Inferior employee)
    {
        if(canHire() && !inferiorList.contains(employee))
        {
            inferiorList.add(employee);
        }
        else
        {
            System.out.println("Cannot hire a new employee");
        }
    }

    public boolean isSatisfied()
    {
        Float satisfiedSalary = 20_000f;
        return getSalary()>satisfiedSalary && limitEmployees-getAmountOfEmployees()>0;
    }

}

package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class FixedBudgetManager extends AbstractEmployee implements Superior, Inferior,SalaryCalculator {
    private Float budget = 100_000f;
    private List<Inferior> inferiorList = new ArrayList<>();

    public FixedBudgetManager(String name, Float salary)
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

    private Float getSumOfSalaries() {
        Float sumOfSalaries=0f;
        for(Inferior e: inferiorList)
        {
            sumOfSalaries+=e.getSalary();
        }
        return sumOfSalaries;
    }


    private boolean shouldCanHire() {
        return budget>getSumOfSalaries();
    }

    @Override
    public void shouldAddEmployee(Inferior employee) {
        if(shouldCanHire() && !inferiorList.contains(employee))
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
        Float satisfiedBudget = 15_000f;
        Float salaries = getSumOfSalaries();
        return budget-salaries>satisfiedBudget && getSalary() > satisfiedSalary;
    }
}

package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager extends Manager {

    public BudgetManager(String name, double salary) {
        super(name, salary);
    }

    double sumOfSalary=0;
    double budget=1000000;
    boolean question;


    boolean isHire(String name, double salary) //czy to name i salary jest employee czy managera?
    {

        if(sumOfSalary<budget)
        {
            question=true;
            sumOfSalary = sumOfSalary + salary; //czy to sumOfSalary sie zapisuje po wyjsciu z funkcji?
            budget=budget-salary;
        }
        else
        {
            question=false;
        }

        return question;
    }

    boolean isSatisfied(double budget) //ale jak dac tu budget ten z metody isHire?
    {
    return (budget<1500 && budget>20000);
    }
}
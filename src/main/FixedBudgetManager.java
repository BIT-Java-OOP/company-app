


public class FixedBudgetManager extends Manager {

    private double budget;
    private int employeeCouner = 0;

    public FixedBudgetManager(String name, double salary, double budget) {

        super(name, salary);
        this.budget = budget;

    }


    public void hire(Employee employee) {

        this.employeeList.add(employee);
        this.employeeCouner += 1;
        this.budget -= employee.getSalary();
    }

    public boolean canHire(){

        int s =0;
        for(Employee e : this.getEmployeeList()){
            s+=e.getSalary();
        }

        return budget > s;
    }


    public boolean isSatisfied(){
        return this.getSalary() > 20000 && budget<15000;

    }

}

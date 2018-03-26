



public class FixedEmployeeNumberManager extends Manager {


    private int employeeCounter = 0;

    public FixedEmployeeNumberManager(String name, double salary) {


        super(name, salary);

    }

    public boolean canHire() {

        return employeeCounter < Manager.MAX_EMPLOYEE;

    }


    public void hire(Employee employee) {

        this.employeeList.add(employee);
        this.employeeCounter += 1;
    }


    public boolean isSatisfied(){
        return this.getSalary() > 20000 && employeeCounter==MAX_EMPLOYEE;
    }

}


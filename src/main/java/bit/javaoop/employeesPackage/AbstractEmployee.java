package bit.javaoop.employeesPackage;

public abstract class AbstractEmployee {
    private String name;
    private double salary;
    public double employeesLimit;
    public double satisfyingSalary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmployeesLimit(double employeesLimit) {
        this.employeesLimit = employeesLimit;
    }

    public String tellName(Employee employee) {
        return employee.getName() + " - ";
    }

    public double tellSalary(Employee employee) {
        return employee.getSalary();
    }

}

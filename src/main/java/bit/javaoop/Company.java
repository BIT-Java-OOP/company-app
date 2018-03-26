package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private Ceo ceo;
    private List<AbstractManager> managersList = new ArrayList<>();
    private List<AbstractEmployee> employeesList = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Ceo ceo) {
        this.name = name;
        this.ceo = ceo;
    }


    public void setCeo(Ceo ceo) {
        if (this.ceo != null) {
            this.ceo.setManagersList(null);
            System.out.println("CEO " + this.ceo.getName() + " was fired!");
        }
        this.ceo = ceo;
        this.ceo.setManagersList(managersList);
        System.out.println(this.ceo.getName() + " is new CEO in " + name + "!");
    }


    public void insertToEmployeesList(AbstractEmployee employee) {
        employeesList.add(employee);
    }

    public void deleteFromEmployeesList(AbstractEmployee employee) {
        employeesList.remove(employee);
    }

    public void insertToManagersList(AbstractManager manager) {
        managersList.add(manager);
    }



    @Override
    public String toString() {
        StringBuilder returningStringCompanyEmployeeList = new StringBuilder("\n" + name + " HIERARCHY\n");
        if (ceo != null) {
            returningStringCompanyEmployeeList.append(ceo.toString());
            for (AbstractEmployee employee : employeesList) {
                returningStringCompanyEmployeeList.append("\t" + employee.getName() + " - Employee\n");
            }
        } else {
            returningStringCompanyEmployeeList.append("No CEO hired\n");
            for (AbstractManager manager : managersList) {
                returningStringCompanyEmployeeList.append(manager.toString());
            }
            for (AbstractEmployee employee : employeesList) {
                returningStringCompanyEmployeeList.append("\t" + employee.getName() + " - Employee\n");
            }
        }
        return returningStringCompanyEmployeeList.toString();
    }

    public boolean checkIfEmployeeWorkInThisCompany(AbstractEmployee employee) {
        return employeesList.contains(employee) || managersList.contains(employee);
    }

    public void printIfEmployeeIsSatisfied(AbstractEmployee employee) {
        if (checkIfEmployeeWorkInThisCompany(employee)) {
            if (employee.isSatisfied()) System.out.println(employee.getName() + " is satisfied.");
            else System.out.println(employee.getName() + " isn't satisfied.");
        } else
            System.out.println(employee.getName() + " doesnt't work in " + name);
    }

    public void printEmployeeName(AbstractEmployee employee) {
        if (checkIfEmployeeWorkInThisCompany(employee))
            System.out.println("This employee name is " + employee.getName());
        else
            System.out.println(employee.getName() + " doesnt't work in " + name);
    }

    public void printEmployeeSalary(AbstractEmployee employee) {
        if (checkIfEmployeeWorkInThisCompany(employee))
            System.out.println("This employee salary equals " + employee.getSalary());
        else
            System.out.println(employee.getName() + " doesnt't work in " + name);
    }

    public void printIfManagerCanHireEmployee(AbstractManager manager, AbstractEmployee employee) {
        if (checkIfEmployeeWorkInThisCompany(manager)) {
            if (manager.canHire(employee)) System.out.println("Manager "+ manager.getName() +" can hire " + employee.getName());
            else System.out.println("Manager "+ manager.getName() +" can't hire " + employee.getName());
        } else
            System.out.println(manager.getName() + " doesnt't work in " + name);
    }

    public void makeManagerHireEmployee(AbstractManager manager, AbstractEmployee employee) {
        if (checkIfEmployeeWorkInThisCompany(manager))
            manager.hireNewEmployee(employee, this);
        else
            System.out.println(manager.getName() + " doesnt't work in " + name);
    }
}

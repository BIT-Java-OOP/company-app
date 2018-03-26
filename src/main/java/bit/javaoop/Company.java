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
        String returningStringCompanyEmployeeList = "\n" + name + " HIERARCHY\n";
        if (ceo != null) {
            returningStringCompanyEmployeeList += ceo.toString();
            for (AbstractEmployee employee : employeesList) {
                returningStringCompanyEmployeeList += "\t" + employee.getName() + " - Employee\n";
            }
        } else {
            returningStringCompanyEmployeeList += "No CEO hired\n";
            for (AbstractManager manager : managersList) {
                returningStringCompanyEmployeeList += manager.toString();
            }
            for (AbstractEmployee employee : employeesList) {
                returningStringCompanyEmployeeList += "\t" + employee.getName() + " - Employee\n";
            }
        }
        return returningStringCompanyEmployeeList;
    }

    public boolean checkIfEmployeeWorkInThisCompany(AbstractEmployee employe) {
        return employeesList.contains(employe) || managersList.contains(employe);
    }

    public void printIfEmployeeIsSatisfied(AbstractEmployee employ) {
        if (checkIfEmployeeWorkInThisCompany(employ)) {
            if (employ.isSatisfied()) System.out.println(employ.getName() + " is satisfied.");
            else System.out.println(employ.getName() + " isn't satisfied.");
        } else
            System.out.println(employ.getName() + " doesnt't work in " + name);
    }

    public void printEmployeeName(AbstractEmployee employ) {
        if (checkIfEmployeeWorkInThisCompany(employ))
            System.out.println("This employee name is " + employ.getName());
        else
            System.out.println(employ.getName() + " doesnt't work in " + name);
    }

    public void printEmployeeSalary(AbstractEmployee employ) {
        if (checkIfEmployeeWorkInThisCompany(employ))
            System.out.println("This employee salary equals " + employ.getSalary());
        else
            System.out.println(employ.getName() + " doesnt't work in " + name);
    }

    public void printIfManagerCanHireEmployee(AbstractManager manager, AbstractEmployee employ) {
        if (checkIfEmployeeWorkInThisCompany(manager)) {
            if (manager.canHire(employ)) System.out.println("Manager "+ manager.getName() +" can hire " + employ.getName());
            else System.out.println("Manager "+ manager.getName() +" can't hire " + employ.getName());
        } else
            System.out.println(manager.getName() + " doesnt't work in " + name);
    }

    public void makeManagerHireEmployee(AbstractManager manager, AbstractEmployee employ) {
        if (checkIfEmployeeWorkInThisCompany(manager))
            manager.hireNewEmployee(employ, this);
        else
            System.out.println(manager.getName() + " doesnt't work in " + name);
    }
}

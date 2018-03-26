

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company  {


    private  CEO ceo;
    private List<Manager> managerList = new ArrayList<>();
    private  String name;

    public Company(String name, CEO ceo){
        this.name = name;
        this.ceo = ceo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {

        System.out.println(this.getName()+ this.ceo.getName());

        for (Manager m : managerList) {
            System.out.println("  " + m.getName() + " " +m.getSalary() +" "+ m.isSatisfied()); // wyswietl
            for (Employee e : m.getEmployeeList()) {
                System.out.println( "     " + e.getName()+ " " +e.getSalary()+ " " + e.isSatisfied()); // wyswietl pracownika
            }
        }
    }


    public void fire(){
        this.ceo = null;

        }

     public void hire(CEO ceo) {

        if(ceo == null){
            this.ceo =ceo;
     }


//    public void addEmoployee(AbstractEmployee employee,String name){
  //      this.employeeList.add(employee,name);


    }

    public void addManager(Manager m){
        this.managerList.add(m);
    }

    public void addEmployee(Manager ma, Employee e){
        for(Manager m:managerList){
            if(m.getName().equals(ma.getName())){
                m.employeeList.add(e);
            }
        }
    }


}

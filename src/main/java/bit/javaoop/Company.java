package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;
    private List<String> managers=new ArrayList<String>();
    private String ceoName;

    Company(String companyName, String ceoName, ArrayList<String> managers)
    {
        this.companyName=companyName;
        Ceo newCeo= new Ceo(ceoName, managers);
        this.ceoName=newCeo.getName();
    }

    //nie wiem jak to zrobić :(
//    @Override
//    public String toString() {
//        System.out.println(Ceo.toString());
//
//        for (Manager m : Ceo.managers) {
//            System.out.println("    " + m.toString());
//
//            for (Employee e : m.getEmployees) {
//                System.out.println("        " + e.toString());
//            }
//        }
//    }


}



package bit.javaoop;

import java.util.ArrayList;


public class CEO {

    private String name;
    private ArrayList<Menager> listOfMenagers;

    CEO(String name) {
        this.name = name;
        listOfMenagers = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Menager> getListOfMenagers() {
        return listOfMenagers;
    }

    void hireAMenager(Menager menager){
        listOfMenagers.add(menager);
    }

    public void setListOfMenagers(ArrayList<Menager> listOfMenagers) {
        this.listOfMenagers = listOfMenagers;
    }
}

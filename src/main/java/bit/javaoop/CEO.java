package bit.javaoop;


import java.util.LinkedList;
import java.util.List;

public class CEO  implements ISuperior{

    private String name;
    private List<ISubordinate> subordinatesList;

    public CEO(String name) {
        this.name=name;
        subordinatesList = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public List<ISubordinate> getSubordinates(){
        return this.subordinatesList;
    }

    public void hireSubordinate(ISubordinate manager){
        if(!subordinatesList.contains(manager)) {
            subordinatesList.add(manager);
        }else
        {
            System.out.println("Manager is already hired!");
        }
    }

    @Override
    public boolean canHireNewSubordinate(ISubordinate newSubordinate) {
        return true;
    }
}

package bit.javaoop;


import java.lang.StringBuilder;
import java.util.List;

public interface ISuperior {


    void hireSubordinate(ISubordinate newEmployee);

    boolean canHireNewSubordinate(ISubordinate newEmployee);

    List<ISubordinate> getSubordinates();

    default void mergeSubordinateList(ISuperior anotherSuperior){
        if( anotherSuperior != null && anotherSuperior.getSubordinates().size() != 0) {
            anotherSuperior.getSubordinates().stream()
                    .filter(x -> !getSubordinates().contains(x))
                    .forEach(y -> getSubordinates().add(y));
        }

    }

    default String printSubordinates(int subordinateLvl){

       StringBuilder sb =new StringBuilder("");

        for(ISubordinate employee : this.getSubordinates()){
            for(int i = subordinateLvl;i>0;i--) {
                sb.append("\t");
            }
            sb.append(employee.getName());
            sb.append(" - ");
            sb.append(employee.getClass().getSimpleName());
            sb.append("\n");

            if(employee instanceof ISuperior) {
                sb.append(((ISuperior)employee).printSubordinates(subordinateLvl+1));
            }
        }
     return sb.toString();
    }
}

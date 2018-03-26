package bit.javaoop;

public class Employee extends AbstractEmployee {
  //  String name;//to jest package private
  //  double salary;
    //konstruktor to inicjalizator klas
    private String name;//najczesciej private tak aby byly dostepne przez metody
    private double salary;
    //dlatego metody ustalamy jako publiczne
    public Employee(String name, double salary) {
        super(name,salary);
        //super to wywolanie konstruktora nadklasy w tym przypadku Abstract...
    }


    public boolean isSatisfied() {
        return getSalary() > 10000;
    }
}

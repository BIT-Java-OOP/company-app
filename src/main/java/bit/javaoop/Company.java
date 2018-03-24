package bit.javaoop;

import java.lang.StringBuilder;

public class Company {

    private String name;
    private CEO ceo;

    private static Company ourInstance = new Company("Company XXX");

    public static Company getInstance() {

        return ourInstance;
    }

    private Company(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void hireNewCEO(CEO newCeo){

        newCeo.mergeSubordinateList(ceo);
        this.ceo = newCeo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-- Company "+this.name+ " --\n");
        sb.append(ceo.getName()+ " - CEO\n");
        sb.append(this.ceo.printSubordinates(1));
        return sb.toString();
    }
}

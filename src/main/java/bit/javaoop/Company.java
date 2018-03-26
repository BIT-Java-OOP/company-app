package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;
    public void hireCEO(CEO ceoToHire){
        this.ceo = ceoToHire;
    }
    @Override
    public String toString(){
        return ceo.toString();
    }
}

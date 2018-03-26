package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }

    @Override
    public String toString(){
        String s = "";
        s += ceo.getName()+" - CEO\n";
        for(AbstractManager am:ceo.getManagers()){
            s+="\t"+am.getName()+" - Manager\n";
            for(AbstractEmployee ae:am.getSubordinates()){
                s+="\t\t"+ae.getName()+" - Employee\n"; //assuming manager cannot employ another manager
            }
        }
        return s;
    }
}

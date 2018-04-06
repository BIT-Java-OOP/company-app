package bit.javaoop;

public class Company {
    private String companyName;
    private CEO ceo;
    private static Company instance = new Company("Java OOP");

    private Company(String companyName)
    {
        this.companyName=companyName;
    }

    public static Company getInstance()
    {
        return instance;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void hireCEO(CEO newCeo)
    {
        newCeo.mergeInferiorList(ceo);
        ceo=newCeo;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Company name: ") ;
        sb.append(companyName);
        sb.append("\n");
        sb.append(ceo.getName());
        sb.append(" -CEO\n");
        sb.append(ceo.printInferiors(1));

    return sb.toString();
    }
}


package bit.javaoop;

public class Company {
    private String companyName;
    private CEO ceo;


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CEO hireCEO()
    {
        CEO ceo1 = CEO.getInstance();
        ceo=ceo1;
        ceo.setName("Krzychu"); //setting name e.g from keyboard
        ceo.addEmployee(ceo);
        return ceo;
    }



    public String toString() {
        String hierarchy="";
        for(AbstractEmployee e: ceo.getEmployeeList())
        {
            switch (e.getPosition())
            {
                case "ceo":
                    hierarchy="\nCEO - " + e.getName()+hierarchy;
                    break;
                case "manager":
                    hierarchy+=("\n\tManager - "+e.getName());
                    break;
                case "employee":
                    hierarchy+=("\n\t\tEmployee - "+e.getName());
                    break;
                default:
                    break;
            }
        }
        hierarchy=("Company name: "+this.companyName + "\n")+hierarchy;
        return hierarchy;
    }
}


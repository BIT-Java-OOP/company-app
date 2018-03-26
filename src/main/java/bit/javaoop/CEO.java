package bit.javaoop;


import sun.security.jca.GetInstance;

public class CEO extends AbstractEmployee{
    private final String position="ceo";
    private String name;

    @Override
    public String getPosition() {
        return position;
    }

    private static CEO ceo;
    private CEO(){}
    public static CEO getInstance()
    {
        if(ceo==null){
            ceo= new CEO();
        }
        return ceo;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isSatisfied() {
        return true;
    }

    public void setName(String name)
    {
        this.name=name;
    }


    public void addEmployee(AbstractEmployee employee)
    {
        getEmployeeList().add(employee);
    }

}

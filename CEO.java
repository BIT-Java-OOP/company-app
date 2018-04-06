package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO extends AbstractEmployee implements Superior{
    private String name;
    private List<Inferior> inferiorList;


    public CEO(String name)
    {
        super(name);
        inferiorList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    @Override
    public List<Inferior> getInferiors() {
        return inferiorList;
    }

    public boolean isSatisfied() {
        return true;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public void addEmployee(Inferior employee)
    {
        if(!inferiorList.contains(employee))
            inferiorList.add(employee);
        else System.out.println("Cannot hire a new employee");
    }

}

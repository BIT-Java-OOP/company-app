package bit.javaoop;

import java.util.ArrayList;


public abstract class AbstractManager extends AbstractEmployee{

    ArrayList<AbstractEmployee> employees_list;

    AbstractManager(String name, double salary, ArrayList<AbstractEmployee> employees_list) {
        super(name, salary);
        this.employees_list = new ArrayList<>();
    }

    ArrayList<AbstractEmployee> getEmployees_list() {
        return employees_list;
    }

    public void setEmployees_list(ArrayList<AbstractEmployee> employees_list) {
        this.employees_list = employees_list;
    }


    public String toStr(int line) {
        String result = new String();
        for(int i=0;i<line;i+=1)
            result+='\t';
        result+=getName()+" - Manager\n";
        for(AbstractEmployee worker : employees_list) {
            result += worker.toStr(line+1);
        }
        return result;
    }
}
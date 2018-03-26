package bit.javaoop;

import java.util.ArrayList;

public class CEO {
    public CEO(String name)
    {
        this.name=name;
    }
    private String name;
    private ArrayList<AbstractEmployee> workers = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  ArrayList<AbstractEmployee> getWorkers() {
        return workers;
    }

    public void addWorker(AbstractEmployee worker)
    {
        workers.add(worker);

    }
}

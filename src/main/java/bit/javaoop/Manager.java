package bit.javaoop;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager extends AbstractEmployee {
    private ArrayList<AbstractEmployee> workers;
    private double budget;
    private int hiringAbility;

    public Manager(String name, double salary, double budget, int hiringAbility) {
        super(name, salary);
        this.budget = budget;
        this.hiringAbility = hiringAbility;
        workers = new ArrayList();
    }

    public Manager(String name, double salary, double budget, int hiringAbility, ArrayList<AbstractEmployee> workers) {
        super(name, salary);
        this.budget = budget;
        this.hiringAbility = hiringAbility;
        this.workers = workers;
    }

    public boolean canHire(AbstractEmployee worker) {
        return ((budget - worker.getSalary()) >= 0) && (hiringAbility > workers.size());
    }

    public void hire(AbstractEmployee worker) {
        if (canHire(worker)) {
            workers.add(worker);
            budget -= worker.getSalary();
        } else
            System.out.println("Error - this manager can not hire this worker");
    }

    @Override
    public boolean isSatisfied() {
        return (getSalary() > 20_000) && (budget < 15_000) && ((hiringAbility-workers.size())==0);
    }

    @Override
    public String toStr(int line) {
        String result = new String();
        for(int i=0;i<line;i+=1)
            result+='\t';
        result+=getName()+" - Manager\n";
        for(AbstractEmployee worker : workers) {
            result += worker.toStr(line+1);
        }
        return result;
    }
}

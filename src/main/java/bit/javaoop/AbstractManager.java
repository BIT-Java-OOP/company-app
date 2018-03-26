package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    protected List<AbstractEmployee> subordinates;

    public List<AbstractEmployee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<AbstractEmployee> subordinates) {
        this.subordinates = subordinates;
    }

    public AbstractManager(String name, double salary){
        super(name,salary);
        subordinates = new ArrayList<AbstractEmployee>();
    }

    public abstract boolean canHire(AbstractEmployee e);

    public abstract void hire(AbstractEmployee e);
}

package bit.javaoop;

import java.util.ArrayList;

public abstract class Manager extends AbstractEmployee {

    public ArrayList<AbstractEmployee> listOfEmployees;

    public Manager(String name, double salary, ArrayList<AbstractEmployee> listOfEmployees) {
        super(name, salary);
        this.listOfEmployees = new ArrayList<>();

    }

    public abstract boolean canHire();

    public abstract void hire(AbstractEmployee employee);

    @Override
    public String toString(int line) {
        String result = new String();
        for (int i = 0; i < line; i += 1)
            result += '\t';
        result += getName() + " - Manager\n";
        for (AbstractEmployee e : listOfEmployees) {
            result += e.toString(line + 1);
        }
        return result;
    }

}

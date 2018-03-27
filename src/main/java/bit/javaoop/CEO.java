package bit.javaoop;

import static bit.javaoop.Company.companyManagers;

public class CEO extends AbstractEmployee {
    private Manager[] managers = new Manager[companyManagers];
    private int totalManagers = 0;

    public CEO(String name, double salary) {
        super(name, salary);
    }

    public Manager[] getManagers() {
        return managers;
    }

    public int getTotalManagers() {
        return totalManagers;
    }

    private boolean canHire() {
        return getTotalManagers() < getManagers().length;
    }

    public void AddToManagers(Manager manager) {
        if (canHire()) {
            getManagers()[getTotalManagers()] = manager;
            ++totalManagers;
        } else
            System.out.println("Cannot hire " + manager.getName());
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 30_000;
    }

    @Override
    public String toString() {
        return "CEO " + getName();
    }
}

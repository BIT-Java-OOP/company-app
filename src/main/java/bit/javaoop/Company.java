package bit.javaoop;

import bit.javaoop.people.Ceo;
import bit.javaoop.people.Manager;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final String name;
    private Ceo ceo;

    private final List<Manager> managers = new ArrayList<>();

    public Company(String name, Ceo ceo) {
        this.name = name;
        this.ceo = ceo;

        ceo.setManagers(managers);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(ceo.getName()).append(" - CEO\n");

        ceo.getManagers().forEach(manager -> {
            builder.append("\t").append(manager.getName()).append(" - Manager\n");
            manager.getEmployees().forEach(employee -> builder.append("\t\t").append(employee.getName()).append(" - Employee\n"));
        });

        return builder.toString();
    }

    public void hireManager(Manager manager) throws CompanyAppException {
        if (manager != null) {
            if (managers.contains(manager))
                throw new CompanyAppException(CompanyAppExceptionMessage.EMPLOYEE_ALREADY_HIRED);
            managers.add(manager);
        } else {
            throw new CompanyAppException(CompanyAppExceptionMessage.NULL_ARG);
        }
    }

    public String getName() {
        return name;
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public List<Manager> getManagers() {
        return managers;
    }
}

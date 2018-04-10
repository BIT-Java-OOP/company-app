package bit.javaoop;

public abstract class AbstractEmployee {
    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract boolean isSatisfied();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(int line) {
        String result = new String();
        StringBuilder sB = new StringBuilder(result);
        for (int i = 0; i < line; i += 1)
            sB.append('\t');

        result += sB.toString() + getName() + " - Employee\n";
        return result;
    }
}

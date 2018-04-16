package bit.javaoop;

public class Main {
    public static void main(String[] args) {
        AbstractEmployee employee = new Employee("maciek", 20_000, new NiceSalaryCalculator(), new B2BEmploymentPolicy());
    }

}

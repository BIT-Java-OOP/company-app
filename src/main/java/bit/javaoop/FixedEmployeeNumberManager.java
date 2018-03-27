package bit.javaoop;

public class FixedEmployeeNumberManager extends Manager {
    private int max_employes;

    public FixedEmployeeNumberManager(String name, double salary, int max_employes) {
        super(name, salary);
        this.max_employes = max_employes;
    }

    @Override
    public boolean isSatisfied(){
        return (getSalary()>20000 && getEmployees_list().size()==getMax_employes());
    }
    @Override
    public boolean canHire(AbstractEmployee e1){
        return getEmployees_list().size()<getMax_employes();
    }
    public int getMax_employes() {
        return max_employes;
    }

}

package bit.javaoop;

public class Company {
    private String name;
    private CEO ceo;

    public void hireCeo(CEO ceo) {
        fireCeo();
        this.ceo = ceo;
    }

    public void fireCeo() {
        this.ceo = null;
    }

    public String getName() {
        return name;
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hehe";
    }
}

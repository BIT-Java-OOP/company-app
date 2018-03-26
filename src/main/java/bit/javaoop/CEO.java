package bit.javaoop;

public class CEO {
    private final int size = 10;
    private Manager tab[] = new Manager[size];
    private int counter;
    private String name;

    public CEO(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public Manager[] getTab() {
        return tab;
    }

    public void setTab(Manager[] tab) {
        this.tab = tab;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addManager(Manager manager){
        if(counter < size)
            tab[counter++] = manager;
    }
    @Override
    public String toString(){
        String text = "";
        text+=getName() + " - CEO\n" ;
        for(int i = 0; i < getCounter(); i++){
            text+="\t"+getTab()[i].getName() + " - " + getTab()[i].getClass().getSimpleName() +"\n"; /// getClass zwraca "klase", getSimpleName zwraca nazwe klasy
            for(int j = 0; j < getTab()[i].getCounter(); j++){
                text+="\t\t"+getTab()[i].getTab()[j].getName() + " - " + getTab()[i].getTab()[j].getClass().getSimpleName() +"\n";
            }
        }
        return text;
    }
}

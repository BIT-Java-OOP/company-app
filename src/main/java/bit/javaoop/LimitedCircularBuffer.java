package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class LimitedCircularBuffer<E> {

    /*private*/ int limit;
    /*private*/ static int lastSet;
    /*private*/ List<E> limitedCircularBuffer;

    public LimitedCircularBuffer(int limit) {
        this.limit = limit;
        this.limitedCircularBuffer = new ArrayList<>();

    }

    void add(E element){
        if(limitedCircularBuffer.size()<limit){
            limitedCircularBuffer.add(element);
            lastSet++;
        }else{
            limitedCircularBuffer.remove(lastSet % limit);
            limitedCircularBuffer.add(lastSet % limit,element);
            lastSet++;
        }

    }

    void remove(E element){
        limitedCircularBuffer.remove(element);
        lastSet--;
    }

    E getNext(E element){
        if(limitedCircularBuffer.indexOf(element)+1==limit){
            return limitedCircularBuffer.get(0);
        }
        return limitedCircularBuffer.get(limitedCircularBuffer.indexOf(element)+1);
    }

    public static void main(String[] args) {
        LimitedCircularBuffer<String> x = new LimitedCircularBuffer<>(3);

        x.add("hej");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("hola");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("buenosdias");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("buenos");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("corazon");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("sonrias");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("ubuntu");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());

        System.out.println(x.getNext("sonrias"));
        System.out.println(x.getNext("corazon"));

        x.remove("ubuntu");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("eeeee");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());
        x.add("mumu");
        System.out.println(lastSet);
        System.out.println(x.limitedCircularBuffer.toString());

    }
}

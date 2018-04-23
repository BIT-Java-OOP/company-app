package bit.javaoop.limitedcircularbuffer;

import java.util.ArrayList;
import java.util.List;

public class LimitedCircularBuffer<E> {
    private List<E> buffer;
    private final int limit;
    private int head;
    private int tail;

    public LimitedCircularBuffer(int limit) {
        this.limit = limit;
        this.buffer = new ArrayList<>();
        head = tail = 0;
    }

    public E get(int index) {
        return buffer.get(index);
    }

    public int size() {
        return buffer.size();
    }

    public E getNext(E element) {
        return buffer.get((buffer.indexOf(element) + 1) % buffer.size());
    }

    public void add(E element) {
        //no duplicates
        if(!buffer.contains(element)) {
            if (buffer.isEmpty()) {
                buffer.add(tail, element);
            } else if (limit == buffer.size()) {
                tail = ++tail % limit;
                head = ++head % limit;
                buffer.set(tail, element);
            } else {
                tail = ++tail % limit;
                buffer.add(tail, element);
            }
        }
        else
            System.out.println("Can't add: duplicated element.");
    }

    public void remove(E element) {
        if(!buffer.isEmpty()) {
            int index = buffer.indexOf(element);
            if (index == tail) {
                buffer.remove(index);
                tail =  tail == 0 ? buffer.size() : --tail % buffer.size();
            }else if(index == head){
                buffer.remove(index);
                head = ++head % buffer.size();
            }else{
                E tailElement = buffer.get(tail);
                E headElement = buffer.get(head);
                buffer.remove(index);
                tail = buffer.indexOf(tailElement);
                head = buffer.indexOf(headElement);
            }
        }
    }

}

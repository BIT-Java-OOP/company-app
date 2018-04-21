package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class LimitedCircularBuffer<E> {

    private List<E> limitedCircularBuffer;
    private int limit;
    private int head;
    private int tail;

    public LimitedCircularBuffer(int limit) {
        this.limit = limit;
        this.limitedCircularBuffer = new ArrayList<>();
    }

    public int size() {
        return limitedCircularBuffer.size();
    }

    public E get(int index) {
        return limitedCircularBuffer.get(index);
    }

    public void add(E element) {
        if (limitedCircularBuffer.size() == 0) {
            limitedCircularBuffer.add(tail, element);
        } else if (limitedCircularBuffer.size() < limit) {
            if (head != 0) head = (head + 1) % limit;
            tail = tail + 1 % limit;
            limitedCircularBuffer.add(tail, element);
            tail = limitedCircularBuffer.indexOf(element);
        } else {
            tail++;
            tail = tail % limit;
            head++;
            head = head % limit;
            limitedCircularBuffer.set(tail, element);
        }
    }

    public E getPrevious(E element) {
        int indexOfElement = limitedCircularBuffer.indexOf(element);
        if (indexOfElement == 0) {
            return limitedCircularBuffer.get(limit - 1);
        }
        return limitedCircularBuffer.get(indexOfElement - 1);
    }


    public void remove(E element) {
        E headElement = limitedCircularBuffer.get(head);
        E tailElement = limitedCircularBuffer.get(tail);
        if (limitedCircularBuffer.indexOf(element) == head) {
            E newHeadElement = getNext(headElement);
            limitedCircularBuffer.remove(element);
            head = limitedCircularBuffer.indexOf(newHeadElement);
            tail = limitedCircularBuffer.indexOf(tailElement);
        } else if (limitedCircularBuffer.indexOf(element) == tail) {
            E newTailElement = getPrevious(tailElement);
            limitedCircularBuffer.remove(element);
            tail = limitedCircularBuffer.indexOf(newTailElement);
            head = limitedCircularBuffer.indexOf(headElement);
        } else {
            limitedCircularBuffer.remove(element);
            tail = limitedCircularBuffer.indexOf(tailElement);
            head = limitedCircularBuffer.indexOf(headElement);
        }
    }
    

    public E getNext(E element) {
        if (limitedCircularBuffer.indexOf(element) + 1 == limit) {
            return limitedCircularBuffer.get(0);
        }
        return limitedCircularBuffer.get(limitedCircularBuffer.indexOf(element) + 1);
    }

}








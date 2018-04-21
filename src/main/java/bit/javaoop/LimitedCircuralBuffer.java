package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class LimitedCircuralBuffer <E> {
    private final int limit;
    private List<E> limitedCircuralBuffer;

    public LimitedCircuralBuffer(int limit) {
        this.limit = limit;
        this.limitedCircuralBuffer = new ArrayList<E>();
    }

    public void add(E e) {
        if (limitedCircuralBuffer.size() < limit) {
            limitedCircuralBuffer.add(e);
        } else {
            for (int i = 0; i < limit - 1; i++) limitedCircuralBuffer.set(i, limitedCircuralBuffer.get(i + 1));
            limitedCircuralBuffer.set(limitedCircuralBuffer.size() - 1, e);
        }
    }

    public boolean remove(E e) {
        return limitedCircuralBuffer.remove(e);
    }

    public E getElement(int index) {
        if (index < limitedCircuralBuffer.size() && index >= 0) return limitedCircuralBuffer.get(index);
        return null;
    }

    public E getNext(E e) {
        int index = limitedCircuralBuffer.indexOf(e);
        if (index == -1) return e;
        else if (index + 1 < limitedCircuralBuffer.size()) return limitedCircuralBuffer.get(index + 1);
        else return limitedCircuralBuffer.get(0);
    }

}
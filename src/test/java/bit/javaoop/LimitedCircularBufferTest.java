package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitedCircularBufferTest {

    private LimitedCircularBuffer<Integer> limitedCircularBuffer;

    @BeforeEach
    void setUp() {


        //given
        limitedCircularBuffer = new LimitedCircularBuffer<>(5);

        //when
        limitedCircularBuffer.add(1);
        limitedCircularBuffer.add(2);
        limitedCircularBuffer.add(3);
        limitedCircularBuffer.add(4);
        limitedCircularBuffer.add(5);
        limitedCircularBuffer.add(6);
        limitedCircularBuffer.add(7);

        //then

    }

    @Test
    void shouldAdd6thElementOnFirstPosition() {

        //given

        //when

        //then
        assertEquals(6,(int) limitedCircularBuffer.get(0));
    }

    @Test
    void shouldRemoveElement() {

        //given

        //when
        limitedCircularBuffer.remove(4);

        //then
        assertEquals(4,limitedCircularBuffer.size());

    }

    @Test
    void shouldReturnNext() {

        //given
        int afterLastElement;
        int afterFirstElement;
        int afterThirdElement;

        //when
        afterLastElement = limitedCircularBuffer.getNext(5);
        afterFirstElement = limitedCircularBuffer.getNext(6);
        afterThirdElement = limitedCircularBuffer.getNext(3);

        //then
        assertTrue((afterFirstElement==7)&&(afterLastElement==6)&&(afterThirdElement==4));
    }

    @Test
    void shouldAddElementsInProperOrder(){

        //given

        //when
        limitedCircularBuffer.remove(3);
        limitedCircularBuffer.remove(6);

        limitedCircularBuffer.add(8);
        limitedCircularBuffer.add(9);

        //then
        assertEquals((int) limitedCircularBuffer.get(2),9);

    }

}
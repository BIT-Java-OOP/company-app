package bit.javaoop;

import bit.javaoop.limitedcircularbuffer.LimitedCircularBuffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LimitedCircularBufferTest {

    LimitedCircularBuffer<String> buffer;

    @BeforeEach
    void setUp() {
        buffer = new LimitedCircularBuffer<>(5);
        buffer.add("1");
        buffer.add("2");
        buffer.add("3");
        buffer.add("4");
    }

    @Test
    void shouldGetNextElement() {
        //given
        //when
        boolean result = buffer.getNext("2") == "3" && buffer.getNext("4") == "1";
        //then
        assertTrue(result);
    }

    @Test
    void shouldAddElements() {
        //given
        //when
        buffer.add("5");
        buffer.add("6");
        buffer.add("7");
        boolean result = (buffer.get(0) == "6" && buffer.get(4) == "5");
        //then
        assertTrue(result);
    }

    @Test
    void shouldRemoveElement() {
        //given
        //when
        buffer.remove("2");
        boolean result = buffer.size() == 3 && buffer.get(1) == "3" && buffer.get(2) == "4";
        //then
        assertTrue(result);
    }
}
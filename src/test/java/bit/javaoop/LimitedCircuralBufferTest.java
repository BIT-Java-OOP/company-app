package bit.javaoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitedCircuralBufferTest {
    private LimitedCircuralBuffer <String> list;

    @BeforeEach
    void setUp(){
        list = new LimitedCircuralBuffer<>(5);
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
    }

    @Test
    void ShouldAddElements(){
        //then
        assertTrue(list.getElement(2).equals("third"));
    }

    @Test
    void ShouldGetNextElement(){
        //when
        String  result = list.getNext("second");

        //then
        assertTrue(list.getElement(2).equals(result));
    }

    @Test
    void ShouldGetFirstElement(){
        //when
         String result = list.getNext("fifth");

        //then
        assertTrue(result.equals("first"));
    }

    @Test
    void ShouldAddOutOfLimitElementCorrectly(){
        //when
        list.add("sixth");

        //then
        assertTrue(list.getElement(4).equals("sixth") && list.getElement(0).equals("second"));
    }


}
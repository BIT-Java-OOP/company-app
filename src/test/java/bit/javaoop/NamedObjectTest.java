package bit.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamedObjectTest {
    @Test
    void getNameTest() {
        NamedObject namedObject = new NamedObject("ABC");

        String name = namedObject.getName();

        assertEquals(name, "ABC");
    }

    @Test
    void setNameTest() {
        NamedObject namedObject = new NamedObject("ABC");

        namedObject.setName("CBA");
        String name = namedObject.getName();

        assertEquals(name, "CBA");
    }
}

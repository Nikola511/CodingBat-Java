package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeeColorTest {
    @Test
    void seeColorTest() {
        System.out.print("Testing seeColor... ");

        assertEquals("red", SeeColor.seeColor("redxx"));
        assertEquals("", SeeColor.seeColor("xxred"));
        assertEquals("blue", SeeColor.seeColor("blueTimes"));
        assertEquals("", SeeColor.seeColor("NoColor"));
        assertEquals("red", SeeColor.seeColor("red"));
        assertEquals("", SeeColor.seeColor("re"));
        assertEquals("", SeeColor.seeColor("blu"));
        assertEquals("blue", SeeColor.seeColor("blue"));
        assertEquals("", SeeColor.seeColor("a"));
        assertEquals("", SeeColor.seeColor(""));
        assertEquals("", SeeColor.seeColor("xyzred"));

        System.out.println("OK");
    }
}
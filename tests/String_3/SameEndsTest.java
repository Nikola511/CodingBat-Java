package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {
    @Test
    void sameEndsTest() {
        System.out.print("Testing sameEnds... ");

        assertEquals("ab", SameEnds.sameEnds("abXYab"));
        assertEquals("x", SameEnds.sameEnds("xx"));
        assertEquals("x", SameEnds.sameEnds("xxx"));
        assertEquals("xx", SameEnds.sameEnds("xxxx"));
        assertEquals("java", SameEnds.sameEnds("javaXYZjava"));
        assertEquals("java", SameEnds.sameEnds("javajava"));
        assertEquals("", SameEnds.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", SameEnds.sameEnds("Hello! and Hello!"));
        assertEquals("", SameEnds.sameEnds("x"));
        assertEquals("", SameEnds.sameEnds(""));
        assertEquals("", SameEnds.sameEnds("abcb"));
        assertEquals("my", SameEnds.sameEnds("mymmy"));

        System.out.println("OK");
    }
}
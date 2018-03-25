package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XyzThereTest {
    @Test
    void xyzThereTest() {
        System.out.print("Testing xyzThere... ");

        assertTrue(XyzThere.xyzThere("abcxyz") );
        assertFalse(XyzThere.xyzThere("abc.xyz"));
        assertTrue(XyzThere.xyzThere("xyz.abc") );
        assertFalse(XyzThere.xyzThere("abcxy"));
        assertTrue(XyzThere.xyzThere("xyz") );
        assertFalse(XyzThere.xyzThere("xy"));
        assertFalse(XyzThere.xyzThere("x"));
        assertFalse(XyzThere.xyzThere(""));
        assertTrue(XyzThere.xyzThere("abc.xyzxyz") );
        assertTrue(XyzThere.xyzThere("abc.xxyz") );
        assertFalse(XyzThere.xyzThere(".xyz"));
        assertFalse(XyzThere.xyzThere("12.xyz"));
        assertTrue(XyzThere.xyzThere("12xyz") );
        assertFalse(XyzThere.xyzThere("1.xyz.xyz2.xyz"));

        System.out.println("OK");
    }
}
package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WithoutEnd2Test {
    @Test
    void withouEnd2Test() {
        System.out.print("Testing withoutEnd2... ");

        assertEquals("ell", WithoutEnd2.withouEnd2("Hello"));
        assertEquals("b", WithoutEnd2.withouEnd2("abc"));
        assertEquals("", WithoutEnd2.withouEnd2("ab"));
        assertEquals("", WithoutEnd2.withouEnd2("a"));
        assertEquals("", WithoutEnd2.withouEnd2(""));
        assertEquals("old", WithoutEnd2.withouEnd2("coldy"));
        assertEquals("ava cod", WithoutEnd2.withouEnd2("java code"));

        System.out.println("OK");
    }
}
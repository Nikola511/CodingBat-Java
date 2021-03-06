package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WithoutStringTest {
    @Test
    void withoutStringTest() {
        System.out.print("Testing withoutString... ");

        assertEquals("He there", WithoutString.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", WithoutString.withoutString("Hello there", "e"));
        assertEquals("Hello there", WithoutString.withoutString("Hello there", "x"));
        assertEquals("Th  a FH", WithoutString.withoutString("This is a FISH", "IS"));
        assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "is"));
        assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "iS"));
        assertEquals("abab", WithoutString.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", WithoutString.withoutString("abxxxab", "xx"));
        assertEquals("abab", WithoutString.withoutString("abxxxab", "x"));
        assertEquals("", WithoutString.withoutString("xxx", "x"));
        assertEquals("x", WithoutString.withoutString("xxx", "xx"));
        assertEquals("xzz", WithoutString.withoutString("xyzzy", "Y"));
        assertEquals("", WithoutString.withoutString("", "x"));
        assertEquals("acac", WithoutString.withoutString("abcabc", "b"));
        assertEquals("AAbb", WithoutString.withoutString("AA22bb", "2"));
        assertEquals("", WithoutString.withoutString("1111", "1"));
        assertEquals("", WithoutString.withoutString("1111", "11"));
        assertEquals("jtx", WithoutString.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi ", WithoutString.withoutString("Hi HoHo", "Ho"));

        System.out.println("OK");
    }
}
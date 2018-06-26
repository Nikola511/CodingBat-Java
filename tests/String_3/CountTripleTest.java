package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountTripleTest {
    @Test
    void countTripleTest() {
        System.out.print("Testing countTriple... ");

        assertEquals(1, CountTriple.countTriple("abcXXXabc"));
        assertEquals(3, CountTriple.countTriple("xxxabyyyycd"));
        assertEquals(0, CountTriple.countTriple("a"));
        assertEquals(0, CountTriple.countTriple(""));
        assertEquals(1, CountTriple.countTriple("XXXabc"));
        assertEquals(2, CountTriple.countTriple("XXXXabc"));
        assertEquals(3, CountTriple.countTriple("XXXXXabc"));
        assertEquals(3, CountTriple.countTriple("222abyyycdXXX"));
        assertEquals(4, CountTriple.countTriple("abYYYabXXXXXab"));
        assertEquals(0, CountTriple.countTriple("abYYXabXXYXXab"));
        assertEquals(0, CountTriple.countTriple("abYYXabXXYXXab"));
        assertEquals(1, CountTriple.countTriple("122abhhh2"));

        System.out.println("OK");
    }
}
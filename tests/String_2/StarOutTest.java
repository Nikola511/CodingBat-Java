package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StarOutTest {
    @Test
    void starOutTest() {
        System.out.print("Testing starOut... ");

        assertEquals("ad", StarOut.starOut("ab*cd"));
        assertEquals("ad", StarOut.starOut("ab**cd"));
        assertEquals("silly", StarOut.starOut("sm*eilly"));
        assertEquals("siy", StarOut.starOut("sm*eil*ly"));
        assertEquals("siy", StarOut.starOut("sm**eil*ly"));
        assertEquals("siy", StarOut.starOut("sm***eil*ly"));
        assertEquals("string", StarOut.starOut("stringy*"));
        assertEquals("tringy", StarOut.starOut("*stringy"));
        assertEquals("ty", StarOut.starOut("*str*in*gy"));
        assertEquals("abc", StarOut.starOut("abc"));
        assertEquals("c", StarOut.starOut("a*bc"));
        assertEquals("ab", StarOut.starOut("ab"));
        assertEquals("", StarOut.starOut("a*b"));
        assertEquals("a", StarOut.starOut("a"));
        assertEquals("", StarOut.starOut("a*"));
        assertEquals("", StarOut.starOut("*a"));
        assertEquals("", StarOut.starOut("*"));
        assertEquals("", StarOut.starOut(""));

        System.out.println("OK");
    }
}
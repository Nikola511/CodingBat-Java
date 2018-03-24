package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {
    @Test
    void nonStartTest() {
        System.out.print("Testing nonStart... ");

        assertEquals("ellohere", NonStart.nonStart("Hello", "There"));
        assertEquals("avaode", NonStart.nonStart("java", "code"));
        assertEquals("hotlava", NonStart.nonStart("shotl", "java"));
        assertEquals("by", NonStart.nonStart("ab", "xy"));
        assertEquals("b", NonStart.nonStart("ab", "x"));
        assertEquals("c", NonStart.nonStart("x", "ac"));
        assertEquals("", NonStart.nonStart("a", "x"));
        assertEquals("itat", NonStart.nonStart("kit", "kat"));
        assertEquals("artart", NonStart.nonStart("mart", "dart"));

        System.out.println("OK");
    }
}
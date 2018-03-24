package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {
    @Test
    void lastTwoTest() {
        System.out.print("Testing lastTwo... ");

        assertEquals("codign", LastTwo.lastTwo("coding"));
        assertEquals("cta", LastTwo.lastTwo("cat"));
        assertEquals("ba", LastTwo.lastTwo("ab"));
        assertEquals("a", LastTwo.lastTwo("a"));
        assertEquals("", LastTwo.lastTwo(""));

        System.out.println("OK");
    }
}
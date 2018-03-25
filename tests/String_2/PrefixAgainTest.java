package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {
    @Test
    void prefixAgainTest() {
        System.out.print("Testing prefixAgain... ");

        assertTrue(PrefixAgain.prefixAgain("abXYabc", 1));
        assertTrue(PrefixAgain.prefixAgain("abXYabc", 2));
        assertFalse(PrefixAgain.prefixAgain("abXYabc", 3));
        assertTrue(PrefixAgain.prefixAgain("xyzxyxyxy", 2));
        assertFalse(PrefixAgain.prefixAgain("xyzxyxyxy", 3));
        assertTrue(PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(PrefixAgain.prefixAgain("a", 1));
        assertTrue(PrefixAgain.prefixAgain("aa", 1));
        assertFalse(PrefixAgain.prefixAgain("ab", 1));

        System.out.println("OK");
    }
}
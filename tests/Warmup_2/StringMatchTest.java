package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {
    @Test
    void stringMatchTest() {
        System.out.print("Testing stringMatch... ");
        assertEquals(3, StringMatch.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, StringMatch.stringMatch("abc", "abc"));
        assertEquals(0, StringMatch.stringMatch("abc", "axc"));
        assertEquals(1, StringMatch.stringMatch("hello", "he"));
        assertEquals(1, StringMatch.stringMatch("he", "hello"));
        assertEquals(0, StringMatch.stringMatch("h", "hello"));
        assertEquals(0, StringMatch.stringMatch("", "hello"));
        assertEquals(1, StringMatch.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, StringMatch.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, StringMatch.stringMatch("iaxxai", "aaxxaaxx"));
        System.out.println("OK");
    }
}
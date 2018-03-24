package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {
    @Test
    void comboStringTest() {
        System.out.print("Testing comboString... ");

        assertEquals("hiHellohi", ComboString.comboString("Hello", "hi"));
        assertEquals("hiHellohi", ComboString.comboString("hi", "Hello"));
        assertEquals("baaab", ComboString.comboString("aaa", "b"));
        assertEquals("baaab", ComboString.comboString("b", "aaa"));
        assertEquals("aaa", ComboString.comboString("aaa", ""));
        assertEquals("bb", ComboString.comboString("", "bb"));
        assertEquals("aaa1234aaa", ComboString.comboString("aaa", "1234"));
        assertEquals("bbaaabb", ComboString.comboString("aaa", "bb"));
        assertEquals("abba", ComboString.comboString("a", "bb"));
        assertEquals("abba", ComboString.comboString("bb", "a"));
        assertEquals("abxyzab", ComboString.comboString("xyz", "ab"));

        System.out.println("OK");
    }
}
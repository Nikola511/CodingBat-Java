package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordAppendTest {
    @Test
    void wordAppendTest() {
        System.out.print("Testing wordAppend... ");

        assertEquals("a", WordAppend.wordAppend(new String[]{"a", "b", "a"}));
        assertEquals("aa", WordAppend.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        assertEquals("a", WordAppend.wordAppend(new String[]{"a", "", "a"}));
        assertEquals("", WordAppend.wordAppend(new String[]{}));
        assertEquals("ba", WordAppend.wordAppend(new String[]{"a", "b", "b", "a", "a"}));
        assertEquals("baa", WordAppend.wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a"}));
        assertEquals("baaba", WordAppend.wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}));
        assertEquals("andornot", WordAppend.wordAppend(new String[]{"not", "and", "or", "and", "this", "and", "or", "that", "not"}));
        assertEquals("", WordAppend.wordAppend(new String[]{"a", "b", "c"}));
        assertEquals("thisandthat", WordAppend.wordAppend(new String[]{"this", "or", "that", "and", "this", "and", "that"}));
        assertEquals("xxyyzzxx", WordAppend.wordAppend(new String[]{"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}));

        System.out.println("OK");
    }
}
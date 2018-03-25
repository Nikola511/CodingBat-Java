package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordEndsTest {
    @Test
    void wordEndsTEst() {
        System.out.print("Testing wordEnds... ");

        assertEquals("c13i", WordEnds.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", WordEnds.wordEnds("XY123XY", "XY"));
        assertEquals("11", WordEnds.wordEnds("XY1XY", "XY"));
        assertEquals("XY", WordEnds.wordEnds("XYXY", "XY"));
        assertEquals("", WordEnds.wordEnds("XY", "XY"));
        assertEquals("", WordEnds.wordEnds("Hi", "XY"));
        assertEquals("", WordEnds.wordEnds("", "XY"));
        assertEquals("cxziij", WordEnds.wordEnds("abc1xyz1i1j", "1"));
        assertEquals("cxz", WordEnds.wordEnds("abc1xyz1", "1"));
        assertEquals("cxz11", WordEnds.wordEnds("abc1xyz11", "1"));
        assertEquals("11", WordEnds.wordEnds("abc1xyz1abc", "abc"));
        assertEquals("acac", WordEnds.wordEnds("abc1xyz1abc", "b"));
        assertEquals("1111", WordEnds.wordEnds("abc1abc1abc", "abc"));

        System.out.println("OK");
    }
}
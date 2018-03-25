package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {
    @Test
    void doubleCharTest() {
        System.out.print("Testing doubleChar... ");

        assertEquals("TThhee", DoubleChar.doubleChar("The"));
        assertEquals("AAAAbbbb", DoubleChar.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", DoubleChar.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", DoubleChar.doubleChar("Word!"));
        assertEquals("!!!!", DoubleChar.doubleChar("!!"));
        assertEquals("", DoubleChar.doubleChar(""));
        assertEquals("aa", DoubleChar.doubleChar("a"));
        assertEquals("..", DoubleChar.doubleChar("."));
        assertEquals("aaaa", DoubleChar.doubleChar("aa"));

        System.out.println("OK");
    }
}
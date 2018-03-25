package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlusOutTest {
    @Test
    void plusOutTest() {
        System.out.print("Testing plusOut... ");

        assertEquals("++xy++", PlusOut.plusOut("12xy34", "xy"));
        assertEquals("1+++++", PlusOut.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", PlusOut.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("ab++ab++++", PlusOut.plusOut("abXYabcXYZ", "ab"));
        assertEquals("++++abc+++", PlusOut.plusOut("abXYabcXYZ", "abc"));
        assertEquals("++XY+++XY+", PlusOut.plusOut("abXYabcXYZ", "XY"));
        assertEquals("+++++++XYZ", PlusOut.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", PlusOut.plusOut("--++ab", "++"));
        assertEquals("++xxxx++", PlusOut.plusOut("aaxxxxbb", "xx"));
        assertEquals("++3++3", PlusOut.plusOut("123123", "3"));

        System.out.println("OK");
    }
}
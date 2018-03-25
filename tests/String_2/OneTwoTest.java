package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OneTwoTest {
    @Test
    void oneTwoTest() {
        System.out.print("Testing oneTwo... ");

        assertEquals("bca", OneTwo.oneTwo("abc"));
        assertEquals("cat", OneTwo.oneTwo("tca"));
        assertEquals("catdog", OneTwo.oneTwo("tcagdo"));
        assertEquals("hocolctea", OneTwo.oneTwo("chocolate"));
        assertEquals("231564897", OneTwo.oneTwo("1234567890"));
        assertEquals("abxabxabxabxabxabxabx", OneTwo.oneTwo("xabxabxabxabxabxabxab"));
        assertEquals("bcaefd", OneTwo.oneTwo("abcdefx"));
        assertEquals("bcaefd", OneTwo.oneTwo("abcdefxy"));
        assertEquals("bcaefdyzx", OneTwo.oneTwo("abcdefxyz"));
        assertEquals("", OneTwo.oneTwo(""));
        assertEquals("", OneTwo.oneTwo("x"));
        assertEquals("", OneTwo.oneTwo("xy"));
        assertEquals("yzx", OneTwo.oneTwo("xyz"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"));

        System.out.println("OK");
    }
}
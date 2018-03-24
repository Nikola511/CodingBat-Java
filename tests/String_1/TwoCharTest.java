package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoCharTest {
    @Test
    void twoCharTest() {
        System.out.print("Testing twoChar... ");

        assertEquals("ja", TwoChar.twoChar("java", 0));
        assertEquals("va", TwoChar.twoChar("java", 2));
        assertEquals("ja", TwoChar.twoChar("java", 3));
        assertEquals("ja", TwoChar.twoChar("java", 4));
        assertEquals("ja", TwoChar.twoChar("java", -1));
        assertEquals("He", TwoChar.twoChar("Hello", 0));
        assertEquals("el", TwoChar.twoChar("Hello", 1));
        assertEquals("He", TwoChar.twoChar("Hello", 99));
        assertEquals("lo", TwoChar.twoChar("Hello", 3));
        assertEquals("He", TwoChar.twoChar("Hello", 4));
        assertEquals("He", TwoChar.twoChar("Hello", 5));
        assertEquals("He", TwoChar.twoChar("Hello", -7));
        assertEquals("He", TwoChar.twoChar("Hello", 6));
        assertEquals("He", TwoChar.twoChar("Hello", -1));
        assertEquals("ya", TwoChar.twoChar("yay", 0));

        System.out.println("OK");
    }
}
package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstTwoTest {
    @Test
    void firstTwoTest() {
        System.out.print("Testing firstTwo... ");

        assertEquals("He", FirstTwo.firstTwo("Hello"));
        assertEquals("ab", FirstTwo.firstTwo("abcdefg"));
        assertEquals("ab", FirstTwo.firstTwo("ab"));
        assertEquals("a", FirstTwo.firstTwo("a"));
        assertEquals("", FirstTwo.firstTwo(""));
        assertEquals("Ki", FirstTwo.firstTwo("Kitten"));
        assertEquals("hi", FirstTwo.firstTwo("hi"));
        assertEquals("hi", FirstTwo.firstTwo("hiya"));

        System.out.println("OK");
    }
}
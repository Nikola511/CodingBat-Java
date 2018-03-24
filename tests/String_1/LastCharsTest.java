package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastCharsTest {
    @Test
    void lastCharsTest() {
        System.out.print("Testing lastChars... ");

        assertEquals("ls", LastChars.lastChars("last", "chars"));
        assertEquals("ya", LastChars.lastChars("yo", "java"));
        assertEquals("h@", LastChars.lastChars("hi", ""));
        assertEquals("@o", LastChars.lastChars("", "hello"));
        assertEquals("@@", LastChars.lastChars("", ""));
        assertEquals("ki", LastChars.lastChars("kitten", "hi"));
        assertEquals("kp", LastChars.lastChars("k", "zip"));
        assertEquals("k@", LastChars.lastChars("kitten", ""));
        assertEquals("kp", LastChars.lastChars("kitten", "zip"));

        System.out.println("OK");
    }
}
package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepeatFrontTest {
    @Test
    void repeatFrontTest() {
        System.out.print("Testing repeatFront... ");

        assertEquals("ChocChoChC", RepeatFront.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", RepeatFront.repeatFront("Chocolate", 3));
        assertEquals("IcI", RepeatFront.repeatFront("Ice Cream", 2));
        assertEquals("I", RepeatFront.repeatFront("Ice Cream", 1));
        assertEquals("", RepeatFront.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", RepeatFront.repeatFront("xyz", 3));
        assertEquals("", RepeatFront.repeatFront("", 0));
        assertEquals("JavaJavJaJ", RepeatFront.repeatFront("Java", 4));
        assertEquals("J", RepeatFront.repeatFront("Java", 1));

        System.out.println("OK");
    }
}
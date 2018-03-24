package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstHalfTest {
    @Test
    void firstHalfTest() {
        System.out.print("Testing firstHalf... ");

        assertEquals("Woo", FirstHalf.firstHalf("WooHoo"));
        assertEquals("Hello", FirstHalf.firstHalf("HelloThere"));
        assertEquals("abc", FirstHalf.firstHalf("abcdef"));
        assertEquals("a", FirstHalf.firstHalf("ab"));
        assertEquals("", FirstHalf.firstHalf(""));
        assertEquals("01234", FirstHalf.firstHalf("0123456789"));
        assertEquals("kit", FirstHalf.firstHalf("kitten"));

        System.out.println("OK");
    }
}
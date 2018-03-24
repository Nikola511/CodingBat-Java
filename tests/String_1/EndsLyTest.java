package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EndsLyTest {
    @Test
    void endsLyTest() {
        System.out.print("Testing endsLy... ");

        assertTrue(EndsLy.endsLy("oddly"));
        assertFalse(EndsLy.endsLy("y"));
        assertFalse(EndsLy.endsLy("oddy"));
        assertFalse(EndsLy.endsLy("oddl"));
        assertFalse(EndsLy.endsLy("olydd"));
        assertTrue(EndsLy.endsLy("ly"));
        assertFalse(EndsLy.endsLy(""));
        assertFalse(EndsLy.endsLy("falsey"));
        assertTrue(EndsLy.endsLy("evenly"));

        System.out.println("OK");
    }
}
package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtFirstTest {
    @Test
    void atFirstTest() {
        System.out.print("Testing atFirst... ");

        assertEquals("he", AtFirst.atFirst("hello"));
        assertEquals("hi", AtFirst.atFirst("hi"));
        assertEquals("h@", AtFirst.atFirst("h"));
        assertEquals("@@", AtFirst.atFirst(""));
        assertEquals("ki", AtFirst.atFirst("kitten"));
        assertEquals("ja", AtFirst.atFirst("java"));
        assertEquals("j@", AtFirst.atFirst("j"));

        System.out.println("OK");
    }
}
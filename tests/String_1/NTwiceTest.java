package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NTwiceTest {
    @Test
    void nTwiceTest() {
        System.out.print("Testing nTwice... ");

        assertEquals("Helo", NTwice.nTwice("Hello", 2));
        assertEquals("Choate", NTwice.nTwice("Chocolate", 3));
        assertEquals("Ce", NTwice.nTwice("Chocolate", 1));
        assertEquals("", NTwice.nTwice("Chocolate", 0));
        assertEquals("Hellello", NTwice.nTwice("Hello", 4));
        assertEquals("CodeCode", NTwice.nTwice("Code", 4));
        assertEquals("Code", NTwice.nTwice("Code", 2));

        System.out.println("OK");
    }
}
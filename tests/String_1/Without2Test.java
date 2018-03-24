package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Without2Test {
    @Test
    void without2Test() {
        System.out.print("Testing without2... ");

        assertEquals("lloHe", Without2.without2("HelloHe"));
        assertEquals("HelloHi", Without2.without2("HelloHi"));
        assertEquals("", Without2.without2("Hi"));
        assertEquals("Chocolate", Without2.without2("Chocolate"));
        assertEquals("x", Without2.without2("xxx"));
        assertEquals("", Without2.without2("xx"));
        assertEquals("x", Without2.without2("x"));
        assertEquals("", Without2.without2(""));
        assertEquals("Fruits", Without2.without2("Fruits"));

        System.out.println("OK");
    }
}
package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Left2Test {
    @Test
    void left2Test() {
        System.out.print("Testing left2... ");

        assertEquals("lloHe", Left2.left2("Hello"));
        assertEquals("vaja", Left2.left2("java"));
        assertEquals("Hi", Left2.left2("Hi"));
        assertEquals("deco", Left2.left2("code"));
        assertEquals("tca", Left2.left2("cat"));
        assertEquals("34512", Left2.left2("12345"));
        assertEquals("ocolateCh", Left2.left2("Chocolate"));
        assertEquals("icksbr", Left2.left2("bricks"));

        System.out.println("OK");
    }
}
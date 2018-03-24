package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Right2Test {
    @Test
    void right2Test() {
        System.out.print("Testing right2... ");

        assertEquals("loHel", Right2.right2("Hello"));
        assertEquals("vaja", Right2.right2("java"));
        assertEquals("Hi", Right2.right2("Hi"));
        assertEquals("deco", Right2.right2("code"));
        assertEquals("atc", Right2.right2("cat"));
        assertEquals("45123", Right2.right2("12345"));

        System.out.println("OK");
    }
}
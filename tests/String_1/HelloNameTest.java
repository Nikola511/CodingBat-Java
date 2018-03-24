package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {
    @Test
    void helloNameTest() {
        System.out.print("Testing helloName... ");

        assertEquals("Hello Bob!", HelloName.helloName("Bob"));
        assertEquals("Hello Alice!", HelloName.helloName("Alice"));
        assertEquals("Hello X!", HelloName.helloName("X"));
        assertEquals("Hello Dolly!", HelloName.helloName("Dolly"));
        assertEquals("Hello Alpha!", HelloName.helloName("Alpha"));
        assertEquals("Hello Omega!", HelloName.helloName("Omega"));
        assertEquals("Hello Goodbye!", HelloName.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", HelloName.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", HelloName.helloName("xyz!"));
        assertEquals("Hello Hello!", HelloName.helloName("Hello"));

        System.out.println("OK");
    }
}
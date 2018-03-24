package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TheEndTest {
    @Test
    void theEndTest() {
        System.out.print("Testing theEnd... ");

        assertEquals("H", TheEnd.theEnd("Hello", true));
        assertEquals("o", TheEnd.theEnd("Hello", false));
        assertEquals("o", TheEnd.theEnd("oh", true));
        assertEquals("h", TheEnd.theEnd("oh", false));
        assertEquals("x", TheEnd.theEnd("x", true));
        assertEquals("x", TheEnd.theEnd("x", false));
        assertEquals("j", TheEnd.theEnd("java", true));
        assertEquals("e", TheEnd.theEnd("chocolate", false));
        assertEquals("1", TheEnd.theEnd("1234", true));
        assertEquals("e", TheEnd.theEnd("code", false));

        System.out.println("OK");
    }
}
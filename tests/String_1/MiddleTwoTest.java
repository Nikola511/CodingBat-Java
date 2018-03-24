package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {
    @Test
    void middleTwoTest() {
        System.out.print("Testing middleTwo... ");

        assertEquals("ri", MiddleTwo.middleTwo("string"));
        assertEquals("od", MiddleTwo.middleTwo("code"));
        assertEquals("ct", MiddleTwo.middleTwo("Practice"));
        assertEquals("ab", MiddleTwo.middleTwo("ab"));
        assertEquals("45", MiddleTwo.middleTwo("0123456789"));

        System.out.println("OK");
    }
}
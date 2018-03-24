package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtraFrontTest {
    @Test
    void extraFrontTest() {
        System.out.print("Testing extraFront... ");

        assertEquals("HeHeHe", ExtraFront.extraFront("Hello"));
        assertEquals("ababab", ExtraFront.extraFront("ab"));
        assertEquals("HHH", ExtraFront.extraFront("H"));
        assertEquals("", ExtraFront.extraFront(""));
        assertEquals("CaCaCa", ExtraFront.extraFront("Candy"));
        assertEquals("CoCoCo", ExtraFront.extraFront("Code"));

        System.out.println("OK");
    }
}
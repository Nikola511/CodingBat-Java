package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HasBadTest {
    @Test
    void hasBadTest() {
        System.out.print("Testing hasBad... ");

        assertTrue(HasBad.hasBad("badxx"));
        assertTrue(HasBad.hasBad("xbadxx"));
        assertFalse(HasBad.hasBad("xxbadxx"));
        assertFalse(HasBad.hasBad("code"));
        assertTrue(HasBad.hasBad("bad"));
        assertFalse(HasBad.hasBad("ba"));
        assertFalse(HasBad.hasBad("xba"));
        assertTrue(HasBad.hasBad("xbad"));
        assertFalse(HasBad.hasBad(""));
        assertTrue(HasBad.hasBad("badyy"));

        System.out.println("OK");
    }
}
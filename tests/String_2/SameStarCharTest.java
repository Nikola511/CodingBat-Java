package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameStarCharTest {
    @Test
    void sameStarCharTest() {
        System.out.print("Testing sameStarChar... ");

        assertTrue(SameStarChar.sameStarChar("xy*yzz"));
        assertFalse(SameStarChar.sameStarChar("xy*zzz"));
        assertTrue(SameStarChar.sameStarChar("*xa*az"));
        assertFalse(SameStarChar.sameStarChar("*xa*bz"));
        assertTrue(SameStarChar.sameStarChar("*xa*a*"));
        assertTrue(SameStarChar.sameStarChar(""));
        assertTrue(SameStarChar.sameStarChar("*xa*a*a"));
        assertFalse(SameStarChar.sameStarChar("*xa*a*b"));
        assertTrue(SameStarChar.sameStarChar("*12*2*2"));
        assertFalse(SameStarChar.sameStarChar("12*2*3*"));
        assertTrue(SameStarChar.sameStarChar("abcDEF"));
        assertFalse(SameStarChar.sameStarChar("XY*YYYY*Z*"));
        assertTrue(SameStarChar.sameStarChar("XY*YYYY*Y*"));
        assertFalse(SameStarChar.sameStarChar("12*2*3*"));
        assertTrue(SameStarChar.sameStarChar("*"));
        assertTrue(SameStarChar.sameStarChar("**"));

        System.out.println("OK");
    }
}
package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoneTeenTest {
    @Test
    void loneTeenTest() {
        System.out.print("Testing loneTeen... ");
        assertTrue(LoneTeen.loneTeen(13, 99));
        assertTrue(LoneTeen.loneTeen(21, 19));
        assertFalse(LoneTeen.loneTeen(13, 13));
        assertTrue(LoneTeen.loneTeen(14, 20));
        assertTrue(LoneTeen.loneTeen(20, 15));
        assertFalse(LoneTeen.loneTeen(16, 17));
        assertTrue(LoneTeen.loneTeen(16, 9));
        assertFalse(LoneTeen.loneTeen(16, 18));
        assertFalse(LoneTeen.loneTeen(13, 19));
        assertTrue(LoneTeen.loneTeen(13, 20));
        assertTrue(LoneTeen.loneTeen(6, 18));
        assertTrue(LoneTeen.loneTeen(99, 13));
        assertFalse(LoneTeen.loneTeen(99, 99));
        System.out.println("OK");
    }
}
package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IcyHotTest {
    @Test
    void icyHotTest() {
        System.out.print("Testing icyHot... ");
        assertTrue(IcyHot.icyHot(120, -1));
        assertTrue(IcyHot.icyHot(-1, 120));
        assertFalse(IcyHot.icyHot(2, 120));
        assertFalse(IcyHot.icyHot(-1, 100));
        assertFalse(IcyHot.icyHot(-2, -2));
        assertFalse(IcyHot.icyHot(120, 120));
        System.out.println("OK");
    }
}
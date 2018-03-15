package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PosNegTest {
    @Test
    void posNegTest() {
        System.out.print("Testing posNeg... ");
        assertTrue(PosNeg.posNeg(1, -1, false));
        assertTrue(PosNeg.posNeg(-1, 1, false));
        assertTrue(PosNeg.posNeg(-4, -5, true));
        assertFalse(PosNeg.posNeg(-4, -5, false));
        assertTrue(PosNeg.posNeg(-4, 5, false));
        assertFalse(PosNeg.posNeg(-4, 5, true));
        assertFalse(PosNeg.posNeg(1, 1, false));
        assertFalse(PosNeg.posNeg(-1, -1, false));
        assertFalse(PosNeg.posNeg(1, -1, true));
        assertFalse(PosNeg.posNeg(-1, 1, true));
        assertFalse(PosNeg.posNeg(1, 1, true));
        assertTrue(PosNeg.posNeg(-1, -1, true));
        assertTrue(PosNeg.posNeg(5, -5, false));
        assertTrue(PosNeg.posNeg(-6, 6, false));
        assertFalse(PosNeg.posNeg(-5, -6, false));
        assertFalse(PosNeg.posNeg(-2, -1, false));
        assertFalse(PosNeg.posNeg(1, 2, false));
        assertFalse(PosNeg.posNeg(-5, 6, true));
        assertTrue(PosNeg.posNeg(-5, -5, true));
        System.out.println("OK");
    }
}
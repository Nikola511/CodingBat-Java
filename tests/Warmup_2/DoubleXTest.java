package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleXTest {
    @Test
    void doubleXTest() {
        System.out.print("Testing doubleX... ");
        assertTrue(DoubleX.doubleX("axxbb"));
        assertFalse(DoubleX.doubleX("axaxax"));
        assertTrue(DoubleX.doubleX("xxxxx"));
        assertFalse(DoubleX.doubleX("xaxxx"));
        assertFalse(DoubleX.doubleX("aaaax"));
        assertFalse(DoubleX.doubleX(""));
        assertFalse(DoubleX.doubleX("abc"));
        assertFalse(DoubleX.doubleX("x"));
        assertTrue(DoubleX.doubleX("xx"));
        assertFalse(DoubleX.doubleX("xax"));
        assertFalse(DoubleX.doubleX("xaxx"));
        System.out.println("OK");
    }
}
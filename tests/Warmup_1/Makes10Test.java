package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Makes10Test {
    @Test
    void makes10Test() {
        System.out.print("Testing makes10... ");
        assertTrue(Makes10.makes10(9, 10));
        assertFalse(Makes10.makes10(9, 9));
        assertTrue(Makes10.makes10(1, 9));
        assertTrue(Makes10.makes10(10, 1));
        assertTrue(Makes10.makes10(10, 10));
        assertTrue(Makes10.makes10(8, 2));
        assertFalse(Makes10.makes10(8, 3));
        assertTrue(Makes10.makes10(10, 42));
        assertTrue(Makes10.makes10(12, -2));
        System.out.println("OK");
    }
}
package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class In1020Test {
    @Test
    void in1020Test() {
        System.out.print("Testing in1020... ");
        assertTrue(In1020.in1020(12, 99));
        assertTrue(In1020.in1020(21, 12));
        assertFalse(In1020.in1020(8, 99));
        assertTrue(In1020.in1020(99, 10));
        assertTrue(In1020.in1020(20, 20));
        assertFalse(In1020.in1020(21, 21));
        assertFalse(In1020.in1020(9, 9));
        System.out.println("OK");
    }
}
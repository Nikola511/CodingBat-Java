package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Max1020Test {
    @Test
    void max1020Test() {
        System.out.print("Testing max1020... ");
        assertEquals(19, Max1020.max1020(11, 19));
        assertEquals(19, Max1020.max1020(19, 11));
        assertEquals(11, Max1020.max1020(11, 9));
        assertEquals(0, Max1020.max1020(9, 21));
        assertEquals(10, Max1020.max1020(10, 21));
        assertEquals(10, Max1020.max1020(21, 10));
        assertEquals(11, Max1020.max1020(9, 11));
        assertEquals(10, Max1020.max1020(23, 10));
        assertEquals(20, Max1020.max1020(20, 10));
        assertEquals(20, Max1020.max1020(7, 20));
        assertEquals(17, Max1020.max1020(17, 16));
        System.out.println("OK");
    }
}
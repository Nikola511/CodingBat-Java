package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCount9Test {
    @Test
    void arrayCount9Test() {
        System.out.print("Testing arrayCount9... ");
        assertEquals(1, ArrayCount9.arrayCount9(new int[]{1, 2, 9}));
        assertEquals(2, ArrayCount9.arrayCount9(new int[]{1, 9, 9}));
        assertEquals(3, ArrayCount9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
        assertEquals(0, ArrayCount9.arrayCount9(new int[]{1, 2, 3}));
        assertEquals(0, ArrayCount9.arrayCount9(new int[]{}));
        assertEquals(0, ArrayCount9.arrayCount9(new int[]{4, 2, 4, 3, 1}));
        assertEquals(1, ArrayCount9.arrayCount9(new int[]{9, 2, 4, 3, 1}));
        System.out.println("OK");
    }
}
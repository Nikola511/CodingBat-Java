package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Array667Test {
    @Test
    void array667Test() {
        System.out.print("Testing array667... ");
        assertEquals(1, Array667.array667(new int[]{6, 6, 2}));
        assertEquals(1, Array667.array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, Array667.array667(new int[]{6, 7, 2, 6}));
        assertEquals(2, Array667.array667(new int[]{6, 6, 2, 6, 7}));
        assertEquals(0, Array667.array667(new int[]{1, 6, 3}));
        assertEquals(0, Array667.array667(new int[]{6, 1}));
        assertEquals(0, Array667.array667(new int[]{}));
        assertEquals(1, Array667.array667(new int[]{3, 6, 7, 6}));
        assertEquals(2, Array667.array667(new int[]{3, 6, 6, 7}));
        assertEquals(1, Array667.array667(new int[]{6, 3, 6, 6}));
        assertEquals(2, Array667.array667(new int[]{6, 7, 6, 6}));
        assertEquals(0, Array667.array667(new int[]{1, 2, 3, 5, 6}));
        assertEquals(1, Array667.array667(new int[]{1, 2, 3, 6, 6}));
        System.out.println("OK");
    }
}
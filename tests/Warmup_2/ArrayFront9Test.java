package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayFront9Test {
    @Test
    void arrayFront9Test() {
        System.out.print("Testing arrayFront9... ");
        assertTrue(ArrayFront9.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertTrue(ArrayFront9.arrayFront9(new int[]{9, 2, 3}));
        assertTrue(ArrayFront9.arrayFront9(new int[]{1, 9, 9}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{1, 2, 3}));
        assertTrue(ArrayFront9.arrayFront9(new int[]{1, 9}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{5, 5}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{2}));
        assertTrue(ArrayFront9.arrayFront9(new int[]{9}));
        assertFalse(ArrayFront9.arrayFront9(new int[]{}));
        assertTrue(ArrayFront9.arrayFront9(new int[]{3, 9, 2, 3, 3}));
        System.out.println("OK");
    }
}
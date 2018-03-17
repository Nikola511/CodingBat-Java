package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Array123Test {
    @Test
    void array123Test() {
        System.out.print("Testing array123... ");
        assertTrue(Array123.array123(new int[]{1, 1, 2, 3, 1}));
        assertFalse(Array123.array123(new int[]{1, 1, 2, 4, 1}));
        assertTrue(Array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertFalse(Array123.array123(new int[]{1, 1, 2, 1, 2, 1}));
        assertTrue(Array123.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertTrue(Array123.array123(new int[]{1, 2, 3}));
        assertFalse(Array123.array123(new int[]{1, 1, 1}));
        assertFalse(Array123.array123(new int[]{1, 2}));
        assertFalse(Array123.array123(new int[]{1}));
        assertFalse(Array123.array123(new int[]{}));
        System.out.println("OK");
    }
}
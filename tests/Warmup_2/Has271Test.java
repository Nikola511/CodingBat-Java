package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Has271Test {
    @Test
    void has271Test() {
        System.out.print("Testing has271... ");
        assertTrue(Has271.has271(new int[]{1, 2, 7, 1}));
        assertFalse(Has271.has271(new int[]{1, 2, 8, 1}));
        assertTrue(Has271.has271(new int[]{2, 7, 1}));
        assertTrue(Has271.has271(new int[]{3, 8, 2}));
        assertTrue(Has271.has271(new int[]{2, 7, 3}));
        assertFalse(Has271.has271(new int[]{2, 7, 4}));
        assertTrue(Has271.has271(new int[]{2, 7, -1}));
        assertFalse(Has271.has271(new int[]{2, 7, -2}));
        assertTrue(Has271.has271(new int[]{4, 5, 3, 8, 0}));
        assertTrue(Has271.has271(new int[]{2, 7, 5, 10, 4}));
        assertTrue(Has271.has271(new int[]{2, 7, -2, 4, 9, 3}));
        assertFalse(Has271.has271(new int[]{2, 7, 5, 10, 1}));
        assertFalse(Has271.has271(new int[]{2, 7, -2, 4, 10, 2}));
        assertFalse(Has271.has271(new int[]{1, 1, 4, 9, 0}));
        assertTrue(Has271.has271(new int[]{1, 1, 4, 9, 4, 9, 2}));
        System.out.println("OK");
    }
}
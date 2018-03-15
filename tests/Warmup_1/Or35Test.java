package Warmup_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Or35Test {
    @Test
    void or35Test() {
        System.out.print("Testing or35... ");
        assertTrue(Or35.or35(3));
        assertTrue(Or35.or35(10));
        assertFalse(Or35.or35(8));
        assertTrue(Or35.or35(15));
        assertTrue(Or35.or35(5));
        assertTrue(Or35.or35(9));
        assertFalse(Or35.or35(4));
        assertFalse(Or35.or35(7));
        assertTrue(Or35.or35(6));
        assertFalse(Or35.or35(17));
        assertTrue(Or35.or35(18));
        assertFalse(Or35.or35(29));
        assertTrue(Or35.or35(20));
        assertTrue(Or35.or35(21));
        assertFalse(Or35.or35(22));
        assertTrue(Or35.or35(45));
        assertTrue(Or35.or35(99));
        assertTrue(Or35.or35(100));
        assertFalse(Or35.or35(101));
        assertFalse(Or35.or35(121));
        assertFalse(Or35.or35(122));
        assertTrue(Or35.or35(123));
        System.out.println("OK");
    }
}
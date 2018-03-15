package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FrontBackTest {
    @Test
    void frontBackTest() {
        System.out.print("Testing frontBack... ");
        assertEquals("eodc", FrontBack.frontBack("code"));
        assertEquals("a", FrontBack.frontBack("a"));
        assertEquals("ba", FrontBack.frontBack("ab"));
        assertEquals("cba", FrontBack.frontBack("abc"));
        assertEquals("", FrontBack.frontBack(""));
        assertEquals("ehocolatC", FrontBack.frontBack("Chocolate"));
        assertEquals("Java", FrontBack.frontBack("aavJ"));
        assertEquals("oellh", FrontBack.frontBack("hello"));
        System.out.println("OK");
    }
}
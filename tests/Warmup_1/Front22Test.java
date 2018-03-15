package Warmup_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Front22Test {
    @Test
    void front22Test() {
        System.out.print("Testing front22... ");
        assertEquals("kikittenki", Front22.front22("kitten"));
        assertEquals("HaHaHa", Front22.front22("Ha"));
        assertEquals("ababcab", Front22.front22("abc"));
        assertEquals("ababab", Front22.front22("ab"));
        assertEquals("aaa", Front22.front22("a"));
        assertEquals("", Front22.front22(""));
        assertEquals("LoLogicLo", Front22.front22("Logic"));
        System.out.println("OK");
    }
}
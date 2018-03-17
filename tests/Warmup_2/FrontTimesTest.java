package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {
    @Test
    void frontTimesTest() {
        System.out.print("Testing frontTimes... ");
        assertEquals("ChoCho", FrontTimes.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", FrontTimes.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", FrontTimes.frontTimes("Abc", 3));
        assertEquals("AbAbAbAb", FrontTimes.frontTimes("Ab", 4));
        assertEquals("AAAA", FrontTimes.frontTimes("A", 4));
        assertEquals("", FrontTimes.frontTimes("", 4));
        assertEquals("", FrontTimes.frontTimes("Abc", 0));
        System.out.println("OK");
    }
}
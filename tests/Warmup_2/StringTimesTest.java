package Warmup_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTimesTest {
    @Test
    void stringTimesTest() {
        System.out.print("Testing stringTimes... ");
        assertEquals("HiHi", StringTimes.stringTimes("Hi", 2));
        assertEquals("HiHiHi", StringTimes.stringTimes("Hi", 3));
        assertEquals("Hi", StringTimes.stringTimes("Hi", 1));
        assertEquals("", StringTimes.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", StringTimes.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", StringTimes.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", StringTimes.stringTimes("x", 4));
        assertEquals("", StringTimes.stringTimes("", 4));
        assertEquals("codecode", StringTimes.stringTimes("code", 2));
        assertEquals("codecodecode", StringTimes.stringTimes("code", 3));
        System.out.println("OK");
    }
}
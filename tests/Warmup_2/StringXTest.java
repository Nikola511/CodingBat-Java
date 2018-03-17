package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringXTest {
    @Test
    void stringXTest() {
        System.out.print("Testing stringX... ");
        assertEquals("xHix", StringX.stringX("xxHxix"));
        assertEquals("abcd", StringX.stringX("abxxxcd"));
        assertEquals("xabcdx", StringX.stringX("xabxxxcdx"));
        assertEquals("xKittenx", StringX.stringX("xKittenx"));
        assertEquals("Hello", StringX.stringX("Hello"));
        assertEquals("xx", StringX.stringX("xx"));
        assertEquals("x", StringX.stringX("x"));
        assertEquals("", StringX.stringX(""));
        System.out.println("OK");
    }
}
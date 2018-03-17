package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {
    @Test
    void stringBitsTest() {
        System.out.print("Testing stringBits... ");
        assertEquals("Hlo", StringBits.stringBits("Hello"));
        assertEquals("H", StringBits.stringBits("Hi"));
        assertEquals("Hello", StringBits.stringBits("Heeololeo"));
        assertEquals("HHH", StringBits.stringBits("HiHiHi"));
        assertEquals("", StringBits.stringBits(""));
        assertEquals("Getns", StringBits.stringBits("Greetings"));
        assertEquals("Coot", StringBits.stringBits("Chocoate"));
        assertEquals("p", StringBits.stringBits("pi"));
        assertEquals("HloKte", StringBits.stringBits("Hello Kitten"));
        assertEquals("happy", StringBits.stringBits("hxaxpxpxy"));
        System.out.println("OK");
    }

}
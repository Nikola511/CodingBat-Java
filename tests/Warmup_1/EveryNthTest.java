package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EveryNthTest {
    @Test
    void everyNthTest() {
        System.out.print("Testing everyNth... ");
        assertEquals("Mrce", EveryNth.everyNth("Miracle", 2));
        assertEquals("aceg", EveryNth.everyNth("abcdefg", 2));
        assertEquals("adg", EveryNth.everyNth("abcdefg", 3));
        assertEquals("Cca", EveryNth.everyNth("Chocolate", 3));
        assertEquals("Ccas", EveryNth.everyNth("Chocolates", 3));
        assertEquals("Coe", EveryNth.everyNth("Chocolates", 4));
        assertEquals("C", EveryNth.everyNth("Chocolates", 100));
        System.out.println("OK");
    }
}
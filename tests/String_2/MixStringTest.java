package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MixStringTest {
    @Test
    void mixStringTest() {
        System.out.print("Testing mixString... ");

        assertEquals("axbycz", MixString.mixString("abc", "xyz"));
        assertEquals("HTihere", MixString.mixString("Hi", "There"));
        assertEquals("xTxhxexre", MixString.mixString("xxxx", "There"));
        assertEquals("xXxx", MixString.mixString("xxx", "X"));
        assertEquals("22/7 around", MixString.mixString("2/", "27 around"));
        assertEquals("Hello", MixString.mixString("", "Hello"));
        assertEquals("Abc", MixString.mixString("Abc", ""));
        assertEquals("", MixString.mixString("", ""));
        assertEquals("ab", MixString.mixString("a", "b"));
        assertEquals("abx", MixString.mixString("ax", "b"));
        assertEquals("abx", MixString.mixString("a", "bx"));
        assertEquals("SLoong", MixString.mixString("So", "Long"));
        assertEquals("LSoong", MixString.mixString("Long", "So"));

        System.out.println("OK");
    }
}
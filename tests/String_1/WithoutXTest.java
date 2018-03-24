package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WithoutXTest {
    @Test
    void withoutXTest() {
        System.out.print("Testing withoutX... ");

        assertEquals("Hi", WithoutX.withoutX("xHix"));
        assertEquals("Hi", WithoutX.withoutX("xHi"));
        assertEquals("Hxi", WithoutX.withoutX("Hxix"));
        assertEquals("Hi", WithoutX.withoutX("Hi"));
        assertEquals("xHi", WithoutX.withoutX("xxHi"));
        assertEquals("Hi", WithoutX.withoutX("Hix"));
        assertEquals("axb", WithoutX.withoutX("xaxbx"));
        assertEquals("", WithoutX.withoutX("xx"));
        assertEquals("", WithoutX.withoutX("x"));
        assertEquals("", WithoutX.withoutX(""));
        assertEquals("Hello", WithoutX.withoutX("Hello"));
        assertEquals("Hexllo", WithoutX.withoutX("Hexllo"));

        System.out.println("OK");
    }
}
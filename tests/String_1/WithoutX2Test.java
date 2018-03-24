package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WithoutX2Test {
    @Test
    void withoutX2Test() {
        System.out.print("Testing withoutX2... ");

        assertEquals("Hi", WithoutX2.withoutX2("xHi"));
        assertEquals("Hi", WithoutX2.withoutX2("Hxi"));
        assertEquals("Hi", WithoutX2.withoutX2("Hi"));
        assertEquals("Hi", WithoutX2.withoutX2("xxHi"));
        assertEquals("Hix", WithoutX2.withoutX2("Hix"));
        assertEquals("axb", WithoutX2.withoutX2("xaxb"));
        assertEquals("", WithoutX2.withoutX2("xx"));
        assertEquals("", WithoutX2.withoutX2("x"));
        assertEquals("", WithoutX2.withoutX2(""));
        assertEquals("Hello", WithoutX2.withoutX2("Hello"));
        assertEquals("Hexllo", WithoutX2.withoutX2("Hexllo"));
        assertEquals("Hxllo", WithoutX2.withoutX2("xHxllo"));

        System.out.println("OK");
    }
}
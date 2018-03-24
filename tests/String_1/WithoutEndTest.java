package String_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEndTest {
    @Test
    void withoutEndTest() {
        System.out.print("Testing withoutEnd... ");

        assertEquals("ell", WithoutEnd.withoutEnd("Hello"));
        assertEquals("av", WithoutEnd.withoutEnd("java"));
        assertEquals("odin", WithoutEnd.withoutEnd("coding"));
        assertEquals("od", WithoutEnd.withoutEnd("code"));
        assertEquals("", WithoutEnd.withoutEnd("ab"));
        assertEquals("hocolate", WithoutEnd.withoutEnd("Chocolate!"));
        assertEquals("itte", WithoutEnd.withoutEnd("kitten"));
        assertEquals("ooho", WithoutEnd.withoutEnd("woohoo"));

        System.out.println("OK");
    }
}
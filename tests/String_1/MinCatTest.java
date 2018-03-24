package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCatTest {
    @Test
    void minCatTest() {
        System.out.print("Testing minCat... ");

        assertEquals("loHi", MinCat.minCat("Hello", "Hi"));
        assertEquals("ellojava", MinCat.minCat("Hello", "java"));
        assertEquals("javaello", MinCat.minCat("java", "Hello"));
        assertEquals("cx", MinCat.minCat("abc", "x"));
        assertEquals("xc", MinCat.minCat("x", "abc"));
        assertEquals("", MinCat.minCat("abc", ""));

        System.out.println("OK");
    }
}
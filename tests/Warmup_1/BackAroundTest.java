package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BackAroundTest {
    @Test
    void backAroundTest() {
        System.out.print("Testing backAround... ");
        assertEquals("tcatt", BackAround.backAround("cat"));
        assertEquals("oHelloo", BackAround.backAround("Hello"));
        assertEquals("aaa", BackAround.backAround("a"));
        assertEquals("cabcc", BackAround.backAround("abc"));
        assertEquals("dreadd", BackAround.backAround("read"));
        assertEquals("obooo", BackAround.backAround("boo"));
        System.out.println("OK");
    }
}
package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeFrontTest {
    @Test
    void deFrontTest() {
        System.out.print("Testing deFront... ");

        assertEquals("llo", DeFront.deFront("Hello"));
        assertEquals("va", DeFront.deFront("java"));
        assertEquals("aay", DeFront.deFront("away"));
        assertEquals("ay", DeFront.deFront("axy"));
        assertEquals("abc", DeFront.deFront("abc"));
        assertEquals("by", DeFront.deFront("xby"));
        assertEquals("ab", DeFront.deFront("ab"));
        assertEquals("a", DeFront.deFront("ax"));
        assertEquals("ab", DeFront.deFront("axb"));
        assertEquals("aa", DeFront.deFront("aaa"));
        assertEquals("bc", DeFront.deFront("xbc"));
        assertEquals("bb", DeFront.deFront("bbb"));
        assertEquals("zz", DeFront.deFront("bazz"));
        assertEquals("", DeFront.deFront("ba"));
        assertEquals("abxyz", DeFront.deFront("abxyz"));
        assertEquals("", DeFront.deFront("hi"));
        assertEquals("s", DeFront.deFront("his"));
        assertEquals("", DeFront.deFront("xz"));
        assertEquals("z", DeFront.deFront("zzz"));

        System.out.println("OK");
    }
}
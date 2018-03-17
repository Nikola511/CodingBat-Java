package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {
    @Test
    void stringYakTest() {
        System.out.print("Testing stringYak... ");
        assertEquals("pak", StringYak.stringYak("yakpak"));
        assertEquals("pak", StringYak.stringYak("pakyak"));
        assertEquals("123ya", StringYak.stringYak("yak123ya"));
        assertEquals("", StringYak.stringYak("yak"));
        assertEquals("xxx", StringYak.stringYak("yakxxxyak"));
        assertEquals("HiHi", StringYak.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", StringYak.stringYak("xxxyakyyyakzzz"));
        System.out.println("OK");
    }
}
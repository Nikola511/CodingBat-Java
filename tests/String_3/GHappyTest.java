package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GHappyTest {
    @Test
    void GHappyTest() {
        System.out.print("Testing gHappy... ");

        assertTrue(GHappy.gHappy("xxggxx"));
        assertFalse(GHappy.gHappy("xxgxx"));
        assertFalse(GHappy.gHappy("xxggyygxx"));
        assertFalse(GHappy.gHappy("g"));
        assertTrue(GHappy.gHappy("gg"));
        assertTrue(GHappy.gHappy(""));
        assertTrue(GHappy.gHappy("xxgggxyz"));
        assertFalse(GHappy.gHappy("xxgggxyg"));
        assertTrue(GHappy.gHappy("xxgggxygg"));
        assertFalse(GHappy.gHappy("mgm"));
        assertTrue(GHappy.gHappy("mggm"));
        assertTrue(GHappy.gHappy("yyygggxyy"));

        System.out.println("OK");
    }
}
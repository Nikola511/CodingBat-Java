package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {
    @Test
    void startOzTest() {
        System.out.print("Testing startOz... ");
        assertEquals("oz", StartOz.startOz("ozymandias"));
        assertEquals("z", StartOz.startOz("bzoo"));
        assertEquals("o", StartOz.startOz("oxx"));
        assertEquals("oz", StartOz.startOz("oz"));
        assertEquals("o", StartOz.startOz("ounce"));
        assertEquals("o", StartOz.startOz("o"));
        assertEquals("", StartOz.startOz("abc"));
        assertEquals("", StartOz.startOz(""));
        assertEquals("", StartOz.startOz("zoo"));
        assertEquals("z", StartOz.startOz("aztec"));
        assertEquals("z", StartOz.startOz("zzzz"));
        assertEquals("oz", StartOz.startOz("oznic"));
        System.out.println("OK");
    }
}
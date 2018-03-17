package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {
    @Test
    void endUpTest() {
        System.out.print("Testing endUp... ");
        assertEquals("HeLLO", EndUp.endUp("Hello"));
        assertEquals("hi thERE", EndUp.endUp("hi there"));
        assertEquals("HI", EndUp.endUp("hi"));
        assertEquals("woo HOO", EndUp.endUp("woo hoo"));
        assertEquals("xyZ12", EndUp.endUp("xyz12"));
        assertEquals("X", EndUp.endUp("x"));
        assertEquals("", EndUp.endUp(""));
        System.out.println("OK");
    }
}
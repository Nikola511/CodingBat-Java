package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StartHiTest {
    @Test
    void startHiTest() {
        System.out.print("Testing startHi... ");
        assertTrue(StartHi.startHi("hi there"));
        assertTrue(StartHi.startHi("hi"));
        assertFalse(StartHi.startHi("hello hi"));
        assertFalse(StartHi.startHi("he"));
        assertFalse(StartHi.startHi("h"));
        assertFalse(StartHi.startHi(""));
        assertFalse(StartHi.startHi("ho hi"));
        assertTrue(StartHi.startHi("hi ho"));
        System.out.println("OK");
    }
}
package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ParrotTroubleTest {
    @Test
    void parrotTroubleTests() {
        System.out.print("Testing parrotTrouble... ");
        assertTrue(ParrotTrouble.parrotTrouble(true, 6));
        assertFalse(ParrotTrouble.parrotTrouble(true, 7));
        assertFalse(ParrotTrouble.parrotTrouble(false, 6));
        assertTrue(ParrotTrouble.parrotTrouble(true, 21));
        assertFalse(ParrotTrouble.parrotTrouble(false, 21));
        assertFalse(ParrotTrouble.parrotTrouble(false, 20));
        assertTrue(ParrotTrouble.parrotTrouble(true, 23));
        assertFalse(ParrotTrouble.parrotTrouble(false, 23));
        assertFalse(ParrotTrouble.parrotTrouble(true, 20));
        assertFalse(ParrotTrouble.parrotTrouble(false, 12));
        System.out.println("OK");
    }
}
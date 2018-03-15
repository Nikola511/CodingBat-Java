package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MonkeyTroubleTest {
    @Test
    void BasicTests() {
        System.out.print("Testing monkeyTrouble... ");
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
        System.out.println("OK");
    }
}
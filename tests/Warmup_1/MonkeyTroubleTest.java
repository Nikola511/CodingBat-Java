package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MonkeyTroubleTest {
    @Test
    void tests0() {
        System.out.println("***********Basic tests************");
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
    }
}
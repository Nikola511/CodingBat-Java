package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {
    @Test
    void lastDigitTest() {
        System.out.print("Testing lastDigit... ");
        assertTrue(LastDigit.lastDigit(7, 17));
        assertFalse(LastDigit.lastDigit(6, 17));
        assertTrue(LastDigit.lastDigit(3, 113));
        assertFalse(LastDigit.lastDigit(114, 113));
        assertTrue(LastDigit.lastDigit(114, 4));
        assertTrue(LastDigit.lastDigit(10, 0));
        assertFalse(LastDigit.lastDigit(11, 0));
        System.out.println("OK");
    }
}
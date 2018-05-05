package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {
    @Test
    void lastDigitTest() {
        System.out.print("Testing lastDigit... ");

        assertTrue(LastDigit.lastDigit(23, 19, 13));
        assertFalse(LastDigit.lastDigit(23, 19, 12));
        assertTrue(LastDigit.lastDigit(23, 19, 3));
        assertTrue(LastDigit.lastDigit(23, 19, 39));
        assertFalse(LastDigit.lastDigit(1, 2, 3));
        assertTrue(LastDigit.lastDigit(1, 1, 2));
        assertTrue(LastDigit.lastDigit(1, 2, 2));
        assertFalse(LastDigit.lastDigit(14, 25, 43));
        assertTrue(LastDigit.lastDigit(14, 25, 45));
        assertFalse(LastDigit.lastDigit(248, 106, 1002));
        assertTrue(LastDigit.lastDigit(248, 106, 1008));
        assertTrue(LastDigit.lastDigit(10, 11, 20));
        assertTrue(LastDigit.lastDigit(0, 11, 0));

        System.out.println("OK");
    }
}
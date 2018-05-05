package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShareDigitTest {
    @Test
    void shareDigitTest() {
        System.out.print("Testing shareDigit... ");

        assertTrue(ShareDigit.shareDigit(12, 23));
        assertFalse(ShareDigit.shareDigit(12, 43));
        assertFalse(ShareDigit.shareDigit(12, 44));
        assertTrue(ShareDigit.shareDigit(23, 12));
        assertTrue(ShareDigit.shareDigit(23, 39));
        assertFalse(ShareDigit.shareDigit(23, 19));
        assertTrue(ShareDigit.shareDigit(30, 90));
        assertFalse(ShareDigit.shareDigit(30, 91));
        assertTrue(ShareDigit.shareDigit(55, 55));
        assertFalse(ShareDigit.shareDigit(55, 44));

        System.out.println("OK");
    }
}
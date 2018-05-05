package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InOrderEqualTest {
    @Test
    void inOrderEqualTest() {
        System.out.print("Testing inOrderEqual... ");

        assertTrue(InOrderEqual.inOrderEqual(2, 5, 11, false));
        assertFalse(InOrderEqual.inOrderEqual(5, 7, 6, false));
        assertTrue(InOrderEqual.inOrderEqual(5, 5, 7, true));
        assertFalse(InOrderEqual.inOrderEqual(5, 5, 7, false));
        assertFalse(InOrderEqual.inOrderEqual(2, 5, 4, false));
        assertFalse(InOrderEqual.inOrderEqual(3, 4, 3, false));
        assertFalse(InOrderEqual.inOrderEqual(3, 4, 4, false));
        assertFalse(InOrderEqual.inOrderEqual(3, 4, 3, true));
        assertTrue(InOrderEqual.inOrderEqual(3, 4, 4, true));
        assertTrue(InOrderEqual.inOrderEqual(1, 5, 5, true));
        assertTrue(InOrderEqual.inOrderEqual(5, 5, 5, true));
        assertFalse(InOrderEqual.inOrderEqual(2, 2, 1, true));
        assertFalse(InOrderEqual.inOrderEqual(9, 2, 2, true));
        assertFalse(InOrderEqual.inOrderEqual(0, 1, 0, true));

        System.out.println("OK");
    }
}
package Logic_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CloseFarTest {
    @Test
    void closeFarTest() {
        System.out.print("Testing closeFar... ");

        assertTrue(CloseFar.closeFar(1, 2, 10));
        assertFalse(CloseFar.closeFar(1, 2, 3));
        assertTrue(CloseFar.closeFar(4, 1, 3));
        assertFalse(CloseFar.closeFar(4, 5, 3));
        assertFalse(CloseFar.closeFar(4, 3, 5));
        assertTrue(CloseFar.closeFar(-1, 10, 0));
        assertTrue(CloseFar.closeFar(0, -1, 10));
        assertTrue(CloseFar.closeFar(10, 10, 8));
        assertFalse(CloseFar.closeFar(10, 8, 9));
        assertFalse(CloseFar.closeFar(8, 9, 10));
        assertFalse(CloseFar.closeFar(8, 9, 7));
        assertTrue(CloseFar.closeFar(8, 6, 9));

        System.out.println("OK");
    }
}
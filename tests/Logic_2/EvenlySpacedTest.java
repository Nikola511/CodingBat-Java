package Logic_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenlySpacedTest {
    @Test
    void evenlySpacedTest() {
        System.out.print("Testing evenlySpaced... ");

        assertTrue(EvenlySpaced.evenlySpaced(2, 4, 6));
        assertTrue(EvenlySpaced.evenlySpaced(4, 6, 2));
        assertFalse(EvenlySpaced.evenlySpaced(4, 6, 3));
        assertTrue(EvenlySpaced.evenlySpaced(6, 2, 4));
        assertFalse(EvenlySpaced.evenlySpaced(6, 2, 8));
        assertTrue(EvenlySpaced.evenlySpaced(2, 2, 2));
        assertFalse(EvenlySpaced.evenlySpaced(2, 2, 3));
        assertTrue(EvenlySpaced.evenlySpaced(9, 10, 11));
        assertTrue(EvenlySpaced.evenlySpaced(10, 9, 11));
        assertFalse(EvenlySpaced.evenlySpaced(10, 9, 9));
        assertFalse(EvenlySpaced.evenlySpaced(2, 4, 4));
        assertFalse(EvenlySpaced.evenlySpaced(2, 2, 4));
        assertFalse(EvenlySpaced.evenlySpaced(3, 6, 12));
        assertFalse(EvenlySpaced.evenlySpaced(12, 3, 6));
        
        System.out.println("OK");
    }
}
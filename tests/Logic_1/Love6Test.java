package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Love6Test {
    @Test
    void love6Test() {
        System.out.print("Testing love6... ");

        assertTrue(Love6.love6(6, 4) );
        assertFalse(Love6.love6(4, 5) );
        assertTrue(Love6.love6(1, 5) );
        assertTrue(Love6.love6(1, 6) );
        assertFalse(Love6.love6(1, 8) );
        assertTrue(Love6.love6(1, 7) );
        assertFalse(Love6.love6(7, 5) );
        assertTrue(Love6.love6(8, 2) );
        assertTrue(Love6.love6(6, 6) );
        assertFalse(Love6.love6(-6, 2) );
        assertTrue(Love6.love6(-4, -10) );
        assertFalse(Love6.love6(-7, 1) );
        assertTrue(Love6.love6(7, -1) );
        assertTrue(Love6.love6(-6, 12) );
        assertFalse(Love6.love6(-2, -4) );
        assertTrue(Love6.love6(7, 1) );
        assertFalse(Love6.love6(0, 9) );
        assertFalse(Love6.love6(8, 3) );
        assertTrue(Love6.love6(3, 3) );
        assertFalse(Love6.love6(3, 4) );

        System.out.println("OK");
    }
}
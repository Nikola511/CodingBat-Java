package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxMod5Test {
    @Test
    void maxMod5Test() {
        System.out.print("Testing maxMod5... ");

        assertEquals(3, MaxMod5.maxMod5(2, 3));
        assertEquals(6, MaxMod5.maxMod5(6, 2));
        assertEquals(3, MaxMod5.maxMod5(3, 2));
        assertEquals(12, MaxMod5.maxMod5(8, 12));
        assertEquals(7, MaxMod5.maxMod5(7, 12));
        assertEquals(6, MaxMod5.maxMod5(11, 6));
        assertEquals(2, MaxMod5.maxMod5(2, 7));
        assertEquals(0, MaxMod5.maxMod5(7, 7));
        assertEquals(9, MaxMod5.maxMod5(9, 1));
        assertEquals(9, MaxMod5.maxMod5(9, 14));
        assertEquals(2, MaxMod5.maxMod5(1, 2));
        
        System.out.println("OK");
    }
}